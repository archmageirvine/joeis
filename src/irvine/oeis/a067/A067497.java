package irvine.oeis.a067;

import irvine.math.z.Z;

/**
 * A067497 Smallest power of 2 with n+1 digits (n&gt;=0). Also numbers k such that 1 is the first digit of 2^k.
 * @author Georg Fischer
 */
public class A067497 extends A067480 {

  /** Construct the sequence. */
  public A067497() {
    super(1);
  }

  /**
   * Generic constructor with parameters
   * @param digit leading digit
   */
  public A067497(final int digit) {
    super(digit);
  }

  @Override
  public Z next() {
    super.next();
    return Z.valueOf(mN);
  }
}
