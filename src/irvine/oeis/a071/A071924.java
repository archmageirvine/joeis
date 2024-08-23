package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a050.A050278;

/**
 * A071924 Highest m such that prime(m) divides the n-th pandigital (A050278).
 * @author Sean A. Irvine
 */
public class A071924 extends A050278 {

  @Override
  public Z next() {
    final Z pandigital = super.next();
    return pandigital == null ? null : Functions.PRIME_PI.z(Functions.GPF.l(pandigital));
  }
}
