package irvine.math;

/**
 * Hold and ordered pair.
 * @author Sean A. Irvine
 */
public final class LongOrderedPair implements Comparable<LongOrderedPair> {

  private final long mA;
  private final long mB;

  /**
   * Construct a pair.
   * @param a one value
   * @param b the other value
   */
  public LongOrderedPair(final long a, final long b) {
    if (a < b) {
      mA = a;
      mB = b;
    } else {
      mA = b;
      mB = a;
    }
  }

  /**
   * Smaller of the pair.
   * @return left
   */
  public long left() {
    return mA;
  }

  /**
   * Larger of the pair.
   * @return right
   */
  public long right() {
    return mB;
  }

  @Override
  public int compareTo(final LongOrderedPair o) {
    final int c = Long.compare(mA, o.mA);
    if (c != 0) {
      return c;
    }
    return Long.compare(mB, o.mB);
  }

  @Override
  public String toString() {
    return '(' + String.valueOf(mA) + ',' + mB + ')';
  }

  @Override
  public boolean equals(final Object obj) {
    if (!(obj instanceof LongOrderedPair)) {
      return false;
    }
    final LongOrderedPair that = (LongOrderedPair) obj;
    return mA == that.mA && mB == that.mB;
  }

  @Override
  public int hashCode() {
    return Long.hashCode(mA) * 1073741827 + Long.hashCode(mB);
  }
}
