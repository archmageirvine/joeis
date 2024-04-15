package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002034;

/**
 * A073331 Smallest k such that S(n) = d(n+k), where S(n) is the Kempner function (A002034) and d(n) is the number of divisors of n (A000005).
 * @author Sean A. Irvine
 */
public class A073331 extends A002034 {

  /** Construct the sequence. */
  public A073331() {
    super(2);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    final long v = super.next().longValue();
    long k = 0;
    while (true) {
      ++k;
      if (v == Functions.SIGMA0.l(mN + k)) {
        return Z.valueOf(k);
      }
    }
  }
}

