package irvine.math.set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

import irvine.math.api.Set;
import irvine.math.z.Z;
import irvine.util.AbstractIterator;

/**
 * Construct the power set of a set.  It should not be necessary to
 * use this directly. Instead use the power set method defined on <code>Set</code>.
 * @author Sean A. Irvine
 * @param <T> Underlying type
 */
class PowerSet<T> extends AbstractSet<Set<T>> {

  private final Set<T> mBase;

  PowerSet(final Set<T> base) {
    if (base == null) {
      throw new NullPointerException();
    }
    mBase = base;
  }

  @Override
  public Z size() {
    if (mBase.isInfinite()) {
      return null;
    }
    // This will explode for large finite base sets
    return Z.ONE.shiftLeft(mBase.size().intValueExact());
  }

  @Override
  public boolean contains(final Set<T> element) {
    return mBase.isSubset(element);
  }

  private static final class PowerSetIterator<T> extends AbstractIterator<Set<T>> {
    private final Set<T> mBase;
    private final Z mPowerSetSize;
    // 1-bits in the syndrome indicate elements to be included in subset
    private Z mSyndrome = Z.ZERO;

    private PowerSetIterator(final Set<T> base, final Z size) {
      mBase = base;
      mPowerSetSize = size;
    }

    @Override
    public boolean hasNext() {
      return mSyndrome.compareTo(mPowerSetSize) < 0;
    }

    @Override
    public Set<T> next() {
      if (mSyndrome.compareTo(mPowerSetSize) >= 0) {
        throw new NoSuchElementException();
      }
      final ArrayList<T> members = new ArrayList<>();
      Z s = mSyndrome;
      for (final T e : mBase) {
        if (s.isZero()) {
          break; // No more elements needed for this subset
        }
        if (!s.isEven()) {
          members.add(e);
        }
        s = s.shiftRight(1);
      }
      mSyndrome = mSyndrome.add(1);
      return new FiniteSet<>(members);
    }
  }

  @Override
  public Iterator<Set<T>> iterator() {
    return new PowerSetIterator<>(mBase, size());
  }

  @Override
  public String toString() {
    return "{\\cal P}(" + mBase + ")";
  }
}
