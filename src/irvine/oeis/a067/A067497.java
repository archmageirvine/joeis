package irvine.oeis.a067;

import irvine.math.z.Z;

/**
 * A067497 Smallest power of 2 with n+1 digits (n&gt;=0). Also numbers k such that 1 is the first digit of 2^k.
 * @author Georg Fischer
 */
public class A067497 extends A067480 {

  /** Construct the sequence. */
  public A067497() {
    this(0, 1);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param digit leading digit
   */
  public A067497(final int offset, final int digit) {
    super(offset, digit);
  }

  @Override
  public Z next() {
    super.next();
    return Z.valueOf(mN);
  }
}
