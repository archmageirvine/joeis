package irvine.math.set;

import irvine.math.z.Z;
import irvine.util.AbstractIterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * A set comprising a range of small integers.
 * @author Sean A. Irvine
 */
public class IntegerSet extends AbstractSet<Integer> {

  private final int mMin;
  private final int mMax;

  /**
   * Construct a new set containing the given integers.
   * @param min smallest integer in the set
   * @param max largest integer in the set
   */
  public IntegerSet(final int min, final int max) {
    if (max < min) {
      throw new IllegalArgumentException();
    }
    mMin = min;
    mMax = max;
  }

  @Override
  public Z size() {
    return Z.valueOf(mMax - mMin + 1);
  }

  @Override
  public boolean contains(final Integer element) {
    return element <= mMax && element >= mMin;
  }

  private static final class IntegerIterator extends AbstractIterator<Integer> {
    private int mN;
    private final int mMax;

    private IntegerIterator(final int min, final int max) {
      mN = min - 1;
      mMax = max;
    }

    @Override
    public boolean hasNext() {
      return mN != mMax;
    }

    @Override
    public Integer next() {
      if (!hasNext()) {
        throw new NoSuchElementException();
      }
      return ++mN;
    }
  }

  @Override
  public Iterator<Integer> iterator() {
    return new IntegerIterator(mMin, mMax);
  }

  @Override
  public String toString() {
    if (mMin == mMax) {
      return "\\{" + mMin + "\\}";
    }
    if (mMin + 1 == mMax) {
      return "\\{" + mMin + "," + mMax + "\\}";
   }
    return "\\{" + mMin + ",...," + mMax + "\\}";
  }
}
