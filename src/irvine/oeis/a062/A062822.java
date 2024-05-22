package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a005.A005117;

/**
 * A062822 Sum of divisors of the squarefree numbers: sigma(A005117(n)).
 * @author Sean A. Irvine
 */
public class A062822 extends A005117 {

  @Override
  public Z next() {
    return Functions.SIGMA1.z(super.next());
  }
}
