package irvine.oeis.a037;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A037949 Primes at which cusp form Delta_16 is not ordinary.
 * @author Sean A. Irvine
 */
public class A037949 extends A000040 {

  {
    setOffset(0);
  }

  private long tau16(final int n) {
    long sum = 0;
    for (int k = 1; k < n; ++k) {
      long t = LongUtils.modPow(k, 6, n);
      t *= Functions.SIGMA1.l(k);
      t %= n;
      t *= Functions.SIGMA1.l(n - k);
      t %= n;
      sum += t;
      sum %= n;
    }
    return (sum * -6552) % n;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (tau16(p.intValueExact()) == 0) {
        return p;
      }
    }
  }
}


