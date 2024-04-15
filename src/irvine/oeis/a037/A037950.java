package irvine.oeis.a037;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A037950 Primes at which cusp form Delta_20 is not ordinary.
 * @author Sean A. Irvine
 */
public class A037950 extends A000040 {

  {
    setOffset(0);
  }

  private long tau20(final int n) {
    long sum = 0;
    for (int k = 1; k < n; ++k) {
      long t = LongUtils.modPow(k, 8, n);
      t *= Functions.SIGMA.l(k);
      t %= n;
      t *= Functions.SIGMA.l(n - k);
      t %= n;
      sum += t;
      sum %= n;
    }
    return (sum * -67320) % n;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (tau20(p.intValueExact()) == 0) {
        return p;
      }
    }
  }
}


