package irvine.math.group;

import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;

import irvine.math.api.Function;
import irvine.math.api.Group;
import irvine.math.api.QuotientGroup;
import irvine.math.api.Set;
import irvine.math.set.AbstractFunction;
import irvine.math.z.Z;
import irvine.util.AbstractIterator;

/**
 * A quotient group.
 * @author Sean A. Irvine
 * @param <T> Underlying type
 */
public class DefaultQuotientGroup<T> extends AbstractGroup<Set<T>> implements QuotientGroup<T> {

  private final Group<T> mParent;
  private final Group<T> mNormalSubgroup;

  /**
   * Construct a new quotient of the parent group using the given normal
   * subgroup.  The supplied normal subgroup is assumed to be valid.
   * @param parent parent group
   * @param normalSubgroup normal subgroup
   * @exception NullPointerException if either group is null.
   */
  DefaultQuotientGroup(final Group<T> parent, final Group<T> normalSubgroup) {
    if (normalSubgroup == null || parent == null) {
      throw new NullPointerException();
    }
    mParent = parent;
    mNormalSubgroup = normalSubgroup;
  }

  @Override
  public Set<T> zero() {
    return mNormalSubgroup; // i.e. coset N0
  }

  @Override
  public boolean contains(final Set<T> element) {
    // todo size checking
    final T aa = element.iterator().next();
    return mParent.rightCoset(mNormalSubgroup, aa).equals(element);
  }

  @Override
  public boolean isAbelian() {
    return mParent.isAbelian() || GroupUtils.isAbelian(this);
  }

  @Override
  public boolean isCyclic() {
    return mParent.isCyclic() || super.isCyclic();
  }

  @Override
  public Z size() {
    if (mParent.isInfinite()) {
      return mParent.index(mNormalSubgroup);
    }
    return mParent.size().divide(mNormalSubgroup.size());
  }

  @Override
  public Set<T> add(final Set<T> a, final Set<T> b) {
    // Get representative elements
    final T aa = a.iterator().next();
    final T bb = b.iterator().next();
    return mParent.rightCoset(mNormalSubgroup, mParent.add(aa, bb));
  }

  @Override
  public Set<T> negate(final Set<T> a) {
    final T aa = a.iterator().next();
    return mParent.rightCoset(mNormalSubgroup, mParent.negate(aa));
  }

  @Override
  public Iterator<Set<T>> iterator() {
    return new AbstractIterator<Set<T>>() {

      private Z mK = Z.ZERO;
      private final HashSet<Set<T>> mSeen = new HashSet<>();
      private final Iterator<T> mParentIterator = mParent.iterator();

      @Override
      public boolean hasNext() {
        return size() == null || mK.compareTo(size()) < 0;
      }

      @Override
      public Set<T> next() {
        if (!hasNext()) {
          throw new NoSuchElementException();
        }
        while (true) {
          final T e = mParentIterator.next();
          final Set<T> coset = mParent.rightCoset(mNormalSubgroup, e);
          if (mSeen.add(coset)) {
            mK = mK.add(1);
            return coset;
          }
        }
      }
    };
  }

  @Override
  public Function<T, Set<T>> naturalHomomorphism() {
    return new AbstractFunction<T, Set<T>>(mParent, this) {
      @Override
      public Set<T> image(final T x) {
        return mParent.rightCoset(mNormalSubgroup, x);
      }
    };
  }

  @Override
  public String toString() {
    return mParent + "/" + mNormalSubgroup;
  }
}
