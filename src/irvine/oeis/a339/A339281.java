package irvine.oeis.a339;

import irvine.math.z.Z;

/**
 * A339281 Number of unoriented series-parallel networks with n colored elements using exactly 2 colors.
 * @author Gregory Morse
 */
public class A339281 extends A339282 {
  private int mN = 0;

  @Override
  public Z next() {
    return compute(mN++, 1);
  }
}
