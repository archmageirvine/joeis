package irvine.oeis.a367;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a003.A003261;

/**
 * A367003 a(n) is the largest prime factor of n*2^n-1.
 * @author Sean A. Irvine
 */
public class A367003 extends A003261 {

  @Override
  public Z next() {
    return Functions.GPF.z(super.next());
  }
}
