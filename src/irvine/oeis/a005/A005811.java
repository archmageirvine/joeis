package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A005811 Number of runs in binary expansion of n (n&gt;0); number of 1's in Gray code for n.
 * @author Sean A. Irvine
 */
public class A005811 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A005811(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A005811() {
    super(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    if (n.isZero()) {
      return Z.ZERO;
    }
    Z r = Z.ONE;
    Z m = n.shiftRight(1);
    Z c = n.and(Z.ONE);
    while (!m.isZero()) {
      if (!m.and(Z.ONE).equals(c)) {
        r = r.add(1);
        c = Z.ONE.subtract(c);
      }
      m = m.shiftRight(1);
    }
    return r;
  }

  @Override
  public Z a(final int n) {
    if (n == 0) {
      return Z.ZERO;
    }
    long r = 1;
    long m = n >>> 1;
    long c = n & 1;
    while (m != 0) {
      if ((m & 1) != c) {
        ++r;
        c = 1 - c;
      }
      m >>>= 1;
    }
    return Z.valueOf(r);
  }

}
