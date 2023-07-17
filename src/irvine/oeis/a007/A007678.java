package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A007678 Number of regions in regular n-gon with all diagonals drawn.
 * @author Sean A. Irvine
 */
public class A007678 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A007678(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A007678() {
    super(1);
  }

  // After T. D. Noe

  protected long mN = 0;

  private boolean del(final long m, final long n) {
    return n % m == 0;
  }

  @Override
  public Z next() {
    if (++mN < 3) {
      return Z.ZERO;
    }
    Z a = Z.valueOf(mN).subtract(6).multiply(mN).add(23).multiply(mN).subtract(42).multiply(mN).add(24).divide(24);
    if (del(2, mN)) {
      a = a.add(Z.FIVE.negate().multiply(mN).add(42).multiply(mN).subtract(40).multiply(mN).subtract(48).divide(48));
    }
    if (del(4, mN)) {
      a = a.subtract(3 * mN / 4);
    }
    if (del(6, mN)) {
      a = a.add(Z.valueOf(-53).multiply(mN).add(310).multiply(mN).divide(12));
    }
    if (del(12, mN)) {
      a = a.add(49 * (mN / 2));
    }
    if (del(18, mN)) {
      a = a.add(32 * mN);
    }
    if (del(24, mN)) {
      a = a.add(19 * mN);
    }
    if (del(30, mN)) {
      a = a.subtract(36 * mN);
    }
    if (del(42, mN)) {
      a = a.subtract(50 * mN);
    }
    if (del(60, mN)) {
      a = a.subtract(190 * mN);
    }
    if (del(84, mN)) {
      a = a.subtract(78 * mN);
    }
    if (del(90, mN)) {
      a = a.subtract(48 * mN);
    }
    if (del(120, mN)) {
      a = a.subtract(78 * mN);
    }
    if (del(210, mN)) {
      a = a.subtract(48 * mN);
    }
    return a;
  }
}
