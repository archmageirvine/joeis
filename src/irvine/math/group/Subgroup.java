package irvine.math.group;

import java.util.Iterator;

import irvine.math.api.Group;
import irvine.math.api.Set;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.q.Q;
import irvine.math.set.Permutation;
import irvine.math.z.Z;

/**
 * A subgroup where calculation is backed by the parent group and membership
 * is controlled by an explicitly provided set.
 * @author Sean A. Irvine
 * @param <T> Underlying type
 */
public class Subgroup<T> extends AbstractGroup<T> {

  private final Group<T> mParent;
  private final Set<T> mSet;

  /**
   * Construct a new subgroup of the parent group using the explicitly given
   * set. It is assumed that the given set indeeds forms the elements of a
   * subgroup of the parent.
   * @param set members of the subgroup
   * @param parent parent group
   */
  public Subgroup(final Set<T> set, final Group<T> parent) {
    if (set == null || parent == null) {
      throw new NullPointerException();
    }
    if (!set.contains(parent.zero())) {
      throw new IllegalArgumentException();
    }
    mSet = set;
    mParent = parent;
  }

  @Override
  public T zero() {
    return mParent.zero();
  }

  @Override
  public Z size() {
    return mSet.size();
  }

  @Override
  public boolean isCyclic() {
    return mParent.isCyclic();
  }

  private Boolean mAbelian = null;

  @Override
  public boolean isAbelian() {
    if (mParent.isAbelian()) {
      return true;
    }
    // Although the parent is non-Abelian this subgroup might be
    if (mAbelian == null) {
      mAbelian = GroupUtils.isAbelian(this); // expensive test
    }
    return mAbelian;
  }

  @Override
  public boolean contains(final T a) {
    return mSet.contains(a);
  }

  @Override
  public T add(final T a, final T b) {
    checkContains(a);
    checkContains(b);
    return mParent.add(a, b);
  }

  @Override
  public T negate(final T a) {
    checkContains(a);
    return mParent.negate(a);
  }

  @Override
  public Iterator<T> iterator() {
    return mSet.iterator();
  }

  @Override
  public String toString() {
    return "subgroup(" + mParent + ")";
  }

  @Override
  public CycleIndex cycleIndex() {
    if (zero() instanceof Permutation<?> && !isInfinite()) {
      final CycleIndex ci = new CycleIndex("Z");
      Z g = Z.ZERO;
      for (final T element : this) {
        g = g.add(1);
        final Permutation<?> pi = (Permutation<?>) element;
        final int[] lengths = pi.cycleLengths();
        final MultivariateMonomial m = new MultivariateMonomial();
        m.setCoefficient(Z.ONE);
        for (int k = 1; k < lengths.length; ++k) {
          m.add(k, lengths[k]);
        }
        ci.add(m);
      }
      ci.multiply(new Q(Z.ONE, g));
      return ci;
    }
    throw new UnsupportedOperationException();
  }
}
