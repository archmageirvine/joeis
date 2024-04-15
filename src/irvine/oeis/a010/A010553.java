package irvine.oeis.a010;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000005;

/**
 * A010553 a(n) = tau(tau(n)).
 * @author Sean A. Irvine
 */
public class A010553 extends A000005 {

  @Override
  public Z next() {
    return Functions.SIGMA0.z(super.next());
  }
}

