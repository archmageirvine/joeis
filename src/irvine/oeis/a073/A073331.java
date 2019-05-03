package irvine.oeis.a073;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a002.A002034;

/**
 * A073331 Smallest k such that <code>S(n) = d(n+k)</code>, where <code>S(n)</code> is the Kempner function <code>(A002034)</code> and <code>d(n)</code> is the number of divisors of <code>n (A000005)</code>.
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
      if (v == Cheetah.factor(mN + k).sigma0AsLong()) {
        return Z.valueOf(k);
      }
    }
  }
}

