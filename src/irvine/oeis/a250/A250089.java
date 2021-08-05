package irvine.oeis.a250;
// manually 2021-08-04

import irvine.math.z.Z;
import irvine.oeis.a051.A051037;

/**
 * A250089 5-smooth numbers (A051037) written in base 60, concatenating the decimal values of the sexagesimal digits.
 * @author Georg Fischer
 */
public class A250089 extends A051037 {

  @Override
  public Z next() {
    return new Z(super.next().toTwoDigits(60));
  }
}
