package irvine.oeis.a367;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002064;

/**
 * A367010 a(n) is the sum of the divisors of n*2^n + 1.
 * @author Sean A. Irvine
 */
public class A367010 extends A002064 {

  @Override
  public Z next() {
    return Functions.SIGMA1.z(super.next());
  }
}
