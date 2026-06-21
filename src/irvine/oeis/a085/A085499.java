package irvine.oeis.a085;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A085499 Primes p having exactly one partition into distinct divisors of p+1.
 * @author Sean A. Irvine
 */
public class A085499 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long pp = p.longValueExact();
      if (A085496.count(pp, ZUtils.toLong(Jaguar.factor(pp + 1).divisors()), 0, 0) == 1) {
        return p;
      }
    }
  }
}
