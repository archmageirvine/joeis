package irvine.oeis.a073;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a002.A002034;

/**
 * A073331 Smallest k such that S(n) = d(n+k), where S(n) is the Kempner function (A002034) and d(n) is the number of divisors of n (A000005).
 * @author Sean A. Irvine
 */
public class A073331 extends A002034 {

  {
    super.next();
  }

  @Override
  public Z next() {
    final long v = super.next().longValue();
    long k = 0;
    while (true) {
      ++k;
      if (v == Jaguar.factor(mN + k).sigma0AsLong()) {
        return Z.valueOf(k);
      }
    }
  }
}

