package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A030485 Squares composed of digits {2, 5, 7}.
 * @author Sean A. Irvine
 */
public class A030485 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A030485(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A030485() {
    super(1);
  }

  // 1 -> 2, 2 -> 5, 0 -> 7
  // all terms of form ...25

  private static final long[] MAP = {7, 2, 5};
  private long mN = -1;

  private Z to257(final long n) {
    long m = n;
    Z t = Z.ONE;
    Z a = Z.ZERO;
    while (m > 0) {
      final int r = (int) (m % 3);
      m /= 3;
      if (r == 0) {
        --m;
      }
      a = t.multiply(MAP[r]).add(a);
      t = t.multiply(10);
    }
    return a.multiply(100).add(25);
  }

  @Override
  public Z next() {
    while (true) {
      final Z a = to257(++mN);
      final long r = a.mod(100);
      if ((r == 25 || r == 56) && a.isSquare()) {
        return a;
      }
    }
  }
}
