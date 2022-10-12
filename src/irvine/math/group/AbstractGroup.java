package irvine.math.group;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import irvine.math.api.Group;
import irvine.math.api.Operation;
import irvine.math.api.Set;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.q.Q;
import irvine.math.set.AbstractOperation;
import irvine.math.set.AbstractSet;
import irvine.math.set.EffortException;
import irvine.math.set.FiniteSet;
import irvine.math.set.Permutation;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.util.Pair;
import irvine.util.array.DynamicLongArray;

/**
 * Default implementation of some methods.
 * @author Sean A. Irvine
 * @param <E> element type
 */
public abstract class AbstractGroup<E> extends AbstractSet<E> implements Group<E> {

  private static final Z SIXTY = Z.valueOf(60);
  private Z mAutSize = null;

  @Override
  public E subtract(final E a, final E b) {
    return add(a, negate(b));
  }

  @Override
  public E signedAdd(final boolean condition, final E a, final E b) {
    return condition ? add(a, b) : subtract(a, b);
  }

  @Override
  public boolean isCyclic() {
    final Z size = size();
    if (size == null) {
      throw new UnsupportedOperationException();
    }
    // All finite groups of prime order are cyclic
    if (size.isPrime()) {
      return true;
    }
    for (final E e : this) {
      if (equals(subgroup(e))) {
        return true; // We found an element generating the group
      }
    }
    return false;
  }

  @Override
  public boolean isSimple() {
    if (isInfinite()) {
      if (isAbelian()) {
        return false;
      }
      throw new UnsupportedOperationException();
    }
    final Z size = size();
    if (size.isPrime()) {
      return true;
    }
    // Only simple finite Abelian groups have prime order
    if (isAbelian()) {
      return false;
    }
    // Feit-Thompson: There are no non-Abelian simple groups of odd order
    if (size.isOdd()) {
      return false;
    }
    // Smallest non-Abelian simple group is of order 60
    if (size.compareTo(SIXTY) < 0) {
      return false;
    }

    // todo
    throw new UnsupportedOperationException();
  }

  @Override
  @SuppressWarnings("unchecked")
  public CycleIndex cycleIndex() {
    if (zero() instanceof Permutation<?>) {
      final List<MultivariateMonomial> monomials = new ArrayList<>();
      // Find largest element actually appearing in permutation
      long n = 1;
      for (final E e : this) {
        final Permutation<Integer> p = (Permutation<Integer>) e;
        for (final List<Integer> cycle : p.cycleStructure()) {
          for (final int t : cycle) {
            if (t > n) {
              n = t;
            }
          }
        }
      }
      final DynamicLongArray counts = new DynamicLongArray();
      for (final E e : this) {
        counts.truncate(0);
        final Permutation<Integer> p = (Permutation<Integer>) e;
        final MultivariateMonomial mm = new MultivariateMonomial();
        mm.setCoefficient(new Q(Z.ONE, size()));
        int total = 0;
        for (final List<Integer> cycle : p.cycleStructure()) {
          final int size = cycle.size();
          if (size != 0) {
            counts.set(size, counts.get(size) + 1);
            total += size;
          }
        }
        counts.set(1, counts.get(1) + n - total);
        for (int k = 0; k < counts.length(); ++k) {
          if (counts.get(k) != 0) {
            mm.add(k, counts.get(k));
          }
        }
        monomials.add(mm);
      }
      return new CycleIndex(toString(), monomials.toArray(new MultivariateMonomial[0]));
    }
    throw new UnsupportedOperationException();
  }

  protected void checkContains(final E element) {
    if (!contains(element)) {
      throw new IllegalArgumentException(this + ": " + element);
    }
  }

  // This could be pulled out as a separate class if ever needed elsewhere
  private static final class GroupBackedOperation<E> extends AbstractOperation<E> {

    private final Group<E> mGroup;

    private GroupBackedOperation(final Group<E> group) {
      super(group, true, group.isAbelian());
      mGroup = group;
    }

    @Override
    public E op(final E a, final E b) {
      return mGroup.add(a, b);
    }
  }

  @Override
  public Operation<E> operation() {
    return new GroupBackedOperation<>(this);
  }

  @Override
  public boolean isSubgroup(final Set<E> elements) {
    // Check basic set sizes
    if (elements == this) {
      return true;
    }
    // Check identity
    if (!elements.contains(zero())) {
      return false;
    }
    final Z size = elements.size();
    // We already know size > 1 since it contains the zero
    final Z groupSize = size();
    if (size == null) {
      if (groupSize != null) {
        return false;
      }
    } else if (groupSize != null && !groupSize.mod(size).isZero()) {
      // Lagrange theorem requires size | groupSize
      return false;
    }
    // Check containment and inverses
    long k = 0;
    for (final E e : elements) {
      if (!contains(e) || !elements.contains(negate(e))) {
        return false;
      }
      if (size == null && ++k == getInfiniteEffort()) {
        throw new EffortException();
      }
    }
    // Check closure
    for (final E e : elements) {
      for (final E f : elements) {
        if (!elements.contains(add(e, f))) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public boolean isNormalSubgroup(final Set<E> elements) {
    if (!isSubgroup(elements)) {
      return false;
    }
    if (isAbelian()) {
      return true; // Every subgroup of an Abelian group is normal
    }
    final Z size = size();
    long k = 0;
    for (final E n : elements) {
      for (final E g : this) {
        if (!elements.contains(add(add(g, n), negate(g)))) {
          return false;
        }
        if (size == null && ++k == getInfiniteEffort()) {
          throw new EffortException();
        }
      }
    }
    return true;
  }

  @Override
  public boolean isSylowSubgroup(final Set<E> elements) {
    // Checking Sylow conditions is usually easier than checking subgroup.
    if (isInfinite() || elements.isInfinite()) {
      return false;
    }
    final Z eSize = elements.size();
    final Z size = size();
    if (Z.ONE.compareTo(eSize) >= 0 || !size.mod(eSize).isZero()) {
      return false;
    }
    if (eSize.isPrime()) {
      return !size.mod(eSize.square()).isZero() && isSubgroup(elements);
    }
    final Z p = eSize.isPower();
    return p != null && p.isPrime() && !size.mod(eSize.multiply(p)).isZero() && isSubgroup(elements);
  }

  @Override
  public AbstractGroup<E> subgroup(final E element) {
    if (zero().equals(element)) {
      return new Singleton<>(element);
    }
    return new Generator<>(this, element);
  }

  @Override
  public AbstractGroup<E> generateSubgroup(final Set<E> elements) {
    if (equals(elements)) {
      return this;
    }
    if (elements.size().isZero()) {
      return new Singleton<>(zero());
    }
    if (Z.ONE.equals(elements.size())) {
      return subgroup(elements.iterator().next());
    }
    return new Generator<>(this, elements, false);
  }

  @Override
  public Z order(final E element) {
    return subgroup(element).size();
  }

  @Override
  public Group<E> centralizer(final E element) {
    if (isAbelian()) {
      return this;
    }
    return new Centralizer<>(this, element);
  }

  @Override
  public Group<E> centre(final Set<E> base) {
    if (isAbelian()) {
      return this;
    }
    return new Centre<>(this, base);
  }

  @Override
  public Set<E> rightCoset(final Set<E> set, final E element) {
    // Strictly speaking "set" should be a subgroup of this group for this
    // coset to be well-defined.  But it is just conceivable that this
    // might be useful in other circumstances.
    if (set.equals(this)) {
      return this;
    }
    if (zero().equals(element)) {
      return set;
    }
    return new RightCoset<>(this, set, element);
  }

  @Override
  public Set<E> leftCoset(final E element, final Set<E> set) {
    // Strictly speaking "set" should be a subgroup of this group for this
    // coset to be well-defined.  But it is just conceivable that this
    // might be useful in other circumstances.
    if (set.equals(this)) {
      return this;
    }
    if (zero().equals(element)) {
      return set;
    }
    return new LeftCoset<>(this, element, set);
  }

  @Override
  public Z index(final Group<E> subgroup) {
    if (!isSubgroup(subgroup)) {
      throw new IllegalArgumentException();
    }
    if (subgroup == this) {
      return Z.ONE;
    }
    if (isInfinite() || subgroup.isInfinite()) {
      throw new UnsupportedOperationException();
    }
    return size().divide(subgroup.size());
  }
  
  @Override
  public Z exponent() {
    if (isCyclic()) {
      return size();
    }
    if (isInfinite()) {
      throw new UnsupportedOperationException();
    }
    Z exponent = Z.ONE;
    for (final E element : this) {
      exponent = exponent.lcm(order(element));
    }
    return exponent;
  }

  @Override
  public boolean isIsomorphic(final Group<?> group) {
    return Isomorphic.isIsomorphic(this, group);
  }

  @Override
  public DefaultQuotientGroup<E> quotientGroup(final Group<E> normalSubgroup) {
    return new DefaultQuotientGroup<>(this, normalSubgroup);
  }

  @Override
  public E coerce(final long n) {
    throw new UnsupportedOperationException();
  }

  @Override
  public E coerce(final Z n) {
    throw new UnsupportedOperationException();
  }

  @Override
  public E random(final Random random) {
    if (isInfinite()) {
      throw new UnsupportedOperationException();
    }
    // This is not a very smart approach, but without further information is about the
    // best that can be done
    Z r = ZUtils.random(random, size());
    for (final E e : this) {
      if (r.isZero()) {
        return e;
      }
      r = r.subtract(1);
    }
    // This should never happen, r cannot exceed the number of elements in the group
    throw new RuntimeException();
  }

  @Override
  public E groupMultiply(final E a, final Z n) {
    if (n.signum() < 0) {
      return groupMultiply(negate(a), n.negate());
    }
    Z m = n;
    E b = m.isEven() ? zero() : a;
    while (m.compareTo(Z.ONE) > 0) {
      b = add(b, b);
      m = m.divide2();
      if (m.isOdd()) {
        b = add(b, a);
      }
    }
    return b;
  }

  @Override
  public E groupMultiply(final E a, final long n) {
    if (n < 0) {
      return groupMultiply(negate(a), -n);
    }
    long m = n;
    E b = (m & 1) == 0 ? zero() : a;
    while (m > 1) {
      b = add(b, b);
      m = m / 2;
      if ((m & 1) == 1) {
        b = add(b, a);
      }
    }
    return b;
  }

  void setAutSize(final Z autSize) {
    mAutSize = autSize;
  }

  @Override
  public Z autOrder() {
    if (mAutSize == null) {
      throw new UnsupportedOperationException();
    }
    return mAutSize;
  }

  private boolean isCommutative(final E e) {
    for (final E g : this) {
      if (!add(e, g).equals(add(g, e))) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Set<E> center() {
    if (isAbelian()) {
      return this;
    }
    if (isInfinite()) {
      throw new UnsupportedOperationException();
    }
    final List<E> set = new ArrayList<>();
    for (final E e : this) {
      if (isCommutative(e)) {
        set.add(e);
      }
    }
    return new FiniteSet<>(set);
  }

  @Override
  public Group<Pair<E, E>> derivedSubgroup() {
    return new DerivedSubgroup<>(this);
  }
}

