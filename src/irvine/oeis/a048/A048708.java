package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048708 Numerators of ratios converging to the Thue-Morse constant, converted to hexadecimal.
 * @author Sean A. Irvine
 */
public class A048708 extends A048707 {

  @Override
  public Z next() {
    return new Z(super.next().toString(16));
  }
}
