package irvine.oeis.a339;

import irvine.math.z.Z;

/**
 * A339280 Number of unoriented series-parallel networks with n elements of 2 colors.
 * @author Gregory Morse
 */
public class A339280 extends A339282 {
  private int mN = 0;

  @Override
  public Z next() {
    return atMost(++mN, 2);
  }
}
