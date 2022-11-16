package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A060384 Number of decimal digits in n-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A060384 extends A000045 {

  @Override
  public Z next() {
    return Z.valueOf(super.next().toString().length());
  }
}
