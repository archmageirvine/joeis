package irvine.math;

/**
 * Hold and ordered pair.
 * @author Sean A. Irvine
 */
public final class OrderedPair implements Comparable<OrderedPair> {

  private final int mA;
  private final int mB;

  /**
   * Construct a pair.
   * @param a one value
   * @param b the other value
   */
  public OrderedPair(final int a, final int b) {
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
   *
   * @return left
   */
  public int left() {
    return mA;
  }

  /**
   * Larger of the pair.
   *
   * @return right
   */
  public int right() {
    return mB;
  }

  @Override
  public int compareTo(final OrderedPair o) {
    final int c = Integer.compare(mA, o.mA);
    if (c != 0) {
      return c;
    }
    return Integer.compare(mB, o.mB);
  }

  @Override
  public String toString() {
    return '(' + String.valueOf(mA) + ',' + String.valueOf(mB) + ')';
  }

  @Override
  public boolean equals(final Object obj) {
    if (!(obj instanceof OrderedPair)) {
      return false;
    }
    final OrderedPair that = (OrderedPair) obj;
    return mA == that.mA && mB == that.mB;
  }

  @Override
  public int hashCode() {
    return Integer.hashCode(mA) ^ Integer.hashCode(mB);
  }
}
