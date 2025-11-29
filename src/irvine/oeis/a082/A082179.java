package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A082179 (c(p)-2)/p where p runs through the primes and where c(p) denotes the p-th Catalan number = binomial(2*p,p)/(p+1).
 * @author Sean A. Irvine
 */
public class A082179 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    return Functions.CATALAN.z(p).subtract(2).divide(p);
  }
}
