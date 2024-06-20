package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A030101 a(n) is the number produced when n is converted to binary digits, the binary digits are reversed and then converted back into a decimal number.
 * @author Sean A. Irvine
 */
public class A030101 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A030101(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A030101() {
    super(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    Z s = n;
    Z r = Z.ZERO;
    while (!s.isZero()) {
      r = r.shiftLeft(1).or(s.and(Z.ONE));
      s = s.shiftLeft(1);
    }
    return r;
  }

  @Override
  public Z a(final int n) {
    int s = n;
    int r = 0;
    while (s != 0) {
      r <<= 1;
      r |= s & 1;
      s >>>= 1;
    }
    return Z.valueOf(r);
  }

}
