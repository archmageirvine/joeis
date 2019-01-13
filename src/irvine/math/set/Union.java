package irvine.math.set;

import java.util.Iterator;

import irvine.math.api.Set;
import irvine.math.z.Z;
import irvine.util.AbstractIterator;

/**
 * Construct a set from the union of two sets.  It should not be necessary to
 * use this directly. Instead use the union methods defined on <code>Set</code>.
 * @author Sean A. Irvine
 * @param <T> Underlying type
 */
final class Union<T> extends AbstractSet<T> {

  /**
   * Form an union of two sets.
   * @param <T> element type
   * @param a first set
   * @param b first set
   * @return union of the sets
   */
  static <T> Set<T> union(final Set<T> a, final Set<T> b) {
    if (a == null || b == null) {
      throw new NullPointerException();
    }
    if (a == b) {
      return a;
    }
    if (a.isEmpty()) {
      return b;
    }
    if (b.isEmpty()) {
      return a;
    }
    if (!a.isInfinite() && a.equals(b)) {
      // Don't try this shortcut on infinite sets because the
      // checking for equality could fail.
      return a;
    }
    return new Union<>(a, b);
  }

  private final Set<T> mSetA;
  private final Set<T> mSetB;

  private Union(final Set<T> a, final Set<T> b) {
    // Order of union makes no theoretical difference, but
    // if there is a difference in size, we choose to make A the
    // larger of the two -- so that later operations can proceed
    // faster.  Thus we should iterate over A in preference to B.
    final Z as = a.size();
    final Z bs = b.size();
    if (as == null) {
      mSetA = a;
      mSetB = b;
    } else if (bs == null) {
      mSetA = b;
      mSetB = a;
    } else if (as.compareTo(bs) >= 0) {
      mSetA = a;
      mSetB = b;
    } else {
      mSetA = b;
      mSetB = a;
    }
  }

  private Z mCachedSize = null;

  @Override
  public Z size() {
    if (mSetA.isInfinite()) {
      return null;
    }
    if (mCachedSize != null) {
      return mCachedSize;
    }
    Z c = mSetA.size();
    for (final T t : mSetB) {
      if (!mSetA.contains(t)) {
        c = c.add(1);
      }
    }
    mCachedSize = c;
    return c;
  }

  @Override
  public boolean contains(final T element) {
    return mSetA.contains(element) || mSetB.contains(element);
  }

  private static final class UnionIterator<T> extends AbstractIterator<T> {
    private final Iterator<T> mIteratorA;
    private final Iterator<T> mIteratorB;
    private final Set<T> mSetA;
    private T mNext = null;

    private UnionIterator(final Set<T> a, final Set<T> b) {
      mSetA = a;
      mIteratorA = a.iterator();
      mIteratorB = b.iterator();
    }

    private boolean updateNext() {
      if (mNext == null) {
        if (mIteratorA.hasNext()) {
          mNext = mIteratorA.next();
          return true;
        }
        while (mIteratorB.hasNext()) {
          final T s = mIteratorB.next();
          if (!mSetA.contains(s)) {
            mNext = s;
            return true;
          }
        }
        return false;
      }
      return true;
    }

    @Override
    public boolean hasNext() {
      return updateNext();
    }

    @Override
    public T next() {
      updateNext();
      final T r = mNext;
      mNext = null;
      return r;
    }
  }

  @Override
  public Iterator<T> iterator() {
    return new UnionIterator<>(mSetA, mSetB);
  }

  @Override
  public String toString() {
    return "(" + mSetB + ")\\cup(" + mSetA + ")";
  }
}
