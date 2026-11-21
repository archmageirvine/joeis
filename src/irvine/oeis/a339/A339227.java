package irvine.oeis.a339;

import irvine.math.z.Z;

/**
 * A339227 Number of oriented series-parallel networks with n colored elements using exactly 2 colors.
 * @author Gregory Morse
 */
public class A339227 extends A339228 {
  private int mN = 0;

  @Override
  public Z next() {
    return compute(mN++, 1);
  }
}
