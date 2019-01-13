package irvine.math.set;

import java.util.Iterator;

import irvine.math.api.Set;
import irvine.math.z.Z;
import irvine.util.AbstractIterator;

/**
 * Construct a set from the intersection of two sets.
 * @author Sean A. Irvine
 * @param <T> Underlying type
 */
final class Intersection<T> extends AbstractSet<T> {

  /**
   * Form an intersection of two sets.
   * @param <T> element type
   * @param a first set
   * @param b first set
   * @return intersection of supplied sets
   */
  static <T> Set<T> intersection(final Set<T> a, final Set<T> b) {
    if (a == null || b == null) {
      throw new NullPointerException();
    }
    if (a == b) {
      return a;
    }
    if (a.isEmpty()) {
      return a;
    }
    if (b.isEmpty()) {
      return b;
    }
    if (!a.isInfinite() && a.equals(b)) {
      // Don't try this shortcut on infinite sets because the
      // checking for equality could fail.
      return a;
    }
    return new Intersection<>(a, b);
  }

  private final Set<T> mSetA;
  private final Set<T> mSetB;

  /**
   * Form an intersection of two sets.
   * @param a first set
   * @param b first set
   */
  private Intersection(final Set<T> a, final Set<T> b) {
    if (a == null || b == null) {
      throw new IllegalArgumentException();
    }
    // Order of intersection makes no theoretical difference, but
    // if there is a difference in size, we choose to make A the
    // smaller of the two -- so that later operations can proceed
    // faster.  Thus we should iterate over A in preference to B.
    final Z as = a.size();
    final Z bs = b.size();
    if (bs == null) {
      mSetA = a;
      mSetB = b;
    } else if (as == null) {
      mSetA = b;
      mSetB = a;
    } else if (as.compareTo(bs) <= 0) {
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
    mSetA.abortOnInfinite();
    if (mCachedSize != null) {
      return mCachedSize;
    }
    Z c = Z.ZERO;
    // This version complains in Eclipse about an unused variable t
    /*
    for (final T t : this) {
      c = c.add(1);
    }
    */
    for (final Iterator<T> it = iterator(); it.hasNext(); it.next()) {
      c = c.add(1);
    }
    mCachedSize = c;
    return c;
  }

  @Override
  public boolean contains(final T element) {
    return mSetA.contains(element) && mSetB.contains(element);
  }

  private static final class IntersectionIterator<T> extends AbstractIterator<T> {
    private final Iterator<T> mIteratorA;
    private final Set<T> mSetB;
    private T mNext = null;

    private IntersectionIterator(final Set<T> a, final Set<T> b) {
      mIteratorA = a.iterator();
      mSetB = b;
    }

    private boolean updateNext() {
      if (mNext == null) {
        while (mIteratorA.hasNext()) {
          final T s = mIteratorA.next();
          if (mSetB.contains(s)) {
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
    return new IntersectionIterator<>(mSetA, mSetB);
  }

  @Override
  public String toString() {
    return "(" + mSetB + ")\\cap(" + mSetA + ")";
  }
}
