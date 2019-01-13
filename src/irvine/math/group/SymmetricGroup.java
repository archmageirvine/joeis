package irvine.math.group;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Random;

import irvine.math.Shuffle;
import irvine.math.api.Group;
import irvine.math.api.Set;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.partitions.IntegerPartition;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.q.Q;
import irvine.math.set.FiniteSet;
import irvine.math.set.IntegerSet;
import irvine.math.set.Permutation;
import irvine.math.z.Z;
import irvine.util.AbstractIterator;

/**
 * Symmetric group on a finite set. That is, composition of permutations.
 * In the operation <code>add(a, b)</code> the permutation <code>a</code>
 * is applied first.
 * @author Sean A. Irvine
 * @param <T> Underlying type
 */
public class SymmetricGroup<T> extends AbstractGroup<Permutation<T>> {

  private static final MemoryFactorial FACTORIAL = new MemoryFactorial();

  /**
   * Construct the symmetric group of order <code>n</code> on the integers
   * 1 to n inclusive.
   * @param n order
   * @return symmetric group
   */
  public static SymmetricGroup<Integer> create(final int n) {
    if (n < 1) {
      throw new IllegalArgumentException();
    }
    return new SymmetricGroup<>(new IntegerSet(1, n), "S_{" + n + "}");
  }

  private final Set<T> mSet;
  private final Permutation<T> mZero;
  private final Z mSize;
  private final String mName;

  private SymmetricGroup(final Set<T> set, final String name) {
    if (set.isInfinite() || Z.ZERO.equals(set.size())) {
      throw new IllegalArgumentException();
    }
    mSet = set;
    mName = name;
    mZero = new Permutation<>(set, new HashMap<>());
    mSize = FACTORIAL.factorial(mSet.size().intValueExact());
  }

  /**
   * Create a symmetric group on the specified set.
   * @param set set of elements
   */
  public SymmetricGroup(final Set<T> set) {
    this(set, "\\Sym(" + set + ")");
  }

  @Override
  public Permutation<T> zero() {
    return mZero;
  }

  @Override
  public Z size() {
    return mSize;
  }

  @Override
  public boolean isAbelian() {
    return mSet.size().compareTo(Z.TWO) <= 0;
  }

  static <T> boolean isValid(final Set<T> set, final Permutation<T> a) {
    final HashSet<T> seenKey = new HashSet<>();
    final HashSet<T> seenValue = new HashSet<>();
    for (final T key : a.domain()) {
      final T value = a.image(key);
      if (!set.contains(key) || seenKey.contains(key)
        || !set.contains(value) || seenValue.contains(value)) {
        return false;
      }
      seenKey.add(key);
      seenValue.add(value);
    }
    return true;
  }

  @Override
  public boolean contains(final Permutation<T> a) {
    return a != null && a.domain().equals(mSet) && (a == mZero || isValid(mSet, a));
  }

  @Override
  public Permutation<T> add(final Permutation<T> a, final Permutation<T> b) {
    checkContains(a);
    checkContains(b);
    final HashMap<T, T> r = new HashMap<>();
    for (final T e : a.domain()) {
      r.put(e, b.image(a.image(e)));
    }
    return new Permutation<>(mSet, r);
  }

  @Override
  public Permutation<T> negate(final Permutation<T> a) {
    checkContains(a);
    final HashMap<T, T> r = new HashMap<>();
    for (final T e : a.domain()) {
      r.put(a.image(e), e);
    }
    return new Permutation<>(mSet, r);
  }

  private static final class SymmetricGroupIterator<T> extends AbstractIterator<Permutation<T>> {
    private final Set<T> mSet;
    private final ArrayList<T> mElements;
    private final Z mSize;
    private final irvine.util.Permutation mPerm;
    private Z mCount = Z.ZERO;

    private SymmetricGroupIterator(final Set<T> set, final Z size) {
      mSet = set;
      mElements = new ArrayList<>();
      for (final T e : set) {
        mElements.add(e);
      }
      mPerm = new irvine.util.Permutation(mElements.size());
      mSize = size;
    }

    @Override
    public boolean hasNext() {
      return mCount.compareTo(mSize) < 0;
    }

    @Override
    public Permutation<T> next() {
      final int[] p = mPerm.next();
      if (p == null) {
        throw new NoSuchElementException();
      }
      mCount = mCount.add(1);
      final HashMap<T, T> r = new HashMap<>();
      for (int k = 0; k < mElements.size(); ++k) {
        r.put(mElements.get(k), mElements.get(p[k]));
      }
      return new Permutation<>(mSet, r);
    }
  }

  @Override
  public Iterator<Permutation<T>> iterator() {
    return new SymmetricGroupIterator<>(mSet, size());
  }

  @Override
  public String toString() {
    return mName;
  }

  /**
   * Compute period of a partition.
   * @param a partition
   * @return period
   */
  public static Z per(final int[] a) {
    Z c = Z.ONE;
    for (int i = 1; i < a.length; ++i) {
      c = c.multiply(FACTORIAL.factorial(a[i])).multiply(Z.valueOf(i).pow(a[i]));
    }
    return c;
  }

  static CycleIndex cycleIndex(final int size) {
    final CycleIndex ci = new CycleIndex("Z(S" + size + ")");
    final IntegerPartition ip = new IntegerPartition(size);
    final int[] a = new int[size + 1];
    int[] p;
    while ((p = ip.next()) != null) {
      IntegerPartition.toCountForm(p, a);
      final MultivariateMonomial mm = new MultivariateMonomial();
      for (int k = 1; k < a.length; ++k) {
        if (a[k] > 0) {
          mm.add(k, a[k]);
        }
      }
      mm.setCoefficient(new Q(Z.ONE, per(a)));
      ci.add(mm);
    }
    return ci;
  }

  @Override
  public CycleIndex cycleIndex() {
    return cycleIndex(mSet.size().intValueExact());
  }

  /**
   * Convert a cycle structure notation of a permutation into an ordinary
   * element of this group, performing compositions as needed to get the
   * final result.  Cycles are composed right to left.  It is assumed that
   * the elements of the cycles are well-formed.
   * @param cycles cycle structure
   * @return permutation
   */
  public Permutation<T> cyclesToPermutation(final List<List<T>> cycles) {
    Permutation<T> p = zero();
    for (int k = cycles.size() - 1; k >= 0; --k) {
      final List<T> cyc = cycles.get(k);
      final Map<T, T> t = new HashMap<>(cyc.size());
      for (int j = 0; j < cyc.size(); ++j) {
        t.put(cyc.get(j), cyc.get((j + 1) % cyc.size()));
      }
      p = add(p, new Permutation<>(mSet, t));
    }
    return p;
  }

  /**
   * The subgroup of this group comprising those permutations of the group that
   * leave all the elements in the supplied set invariant.
   * @param elements elements that must be invariant
   * @return the subgroup
   */
  public Group<Permutation<T>> elementwiseSubgroup(final Set<T> elements) {
    final HashSet<Permutation<T>> subset = new HashSet<>();
    for (final Permutation<T> p : this) {
      boolean invariant = true;
      for (final T e : elements) {
        if (!p.image(e).equals(e)) {
          invariant = false;
          break;
        }
      }
      if (invariant) {
        subset.add(p);
      }
    }
    return new Subgroup<>(new FiniteSet<>(subset), this);
  }

  /**
   * The subgroup of this group comprising those permutations of the group that
   * leave the elements in the supplied set in the supplied set.
   * @param elements elements that must be invariant
   * @return the subgroup
   */
  public Group<Permutation<T>> invariantSubgroup(final Set<T> elements) {
    final HashSet<Permutation<T>> subset = new HashSet<>();
    for (final Permutation<T> p : this) {
      boolean invariant = true;
      for (final T e : elements) {
        if (!elements.contains(p.image(e))) {
          invariant = false;
          break;
        }
      }
      if (invariant) {
        subset.add(p);
      }
    }
    return new Subgroup<>(new FiniteSet<>(subset), this);
  }

  @Override
  @SuppressWarnings("unchecked")
  public Permutation<T> random(final Random random) {
    // This is much faster than stepping through permutations of AbstractGroup,
    // but still will be exceedingly slow for large groups
    final T[] r = (T[]) new Object[mSet.size().intValueExact()];
    int k = 0;
    for (final T e : mSet) {
      r[k++] = e;
    }
    Shuffle.shuffle(r, random);
    final HashMap<T, T> perm = new HashMap<>(r.length);
    k = 0;
    for (final T e : mSet) {
      perm.put(e, r[k++]);
    }
    return new Permutation<>(mSet, perm);
  }
}
