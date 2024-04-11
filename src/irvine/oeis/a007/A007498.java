package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.math.cyclotomic.Cyclotomic;
import irvine.oeis.Sequence1;

/**
 * A007498 Unique period lengths of primes mentioned in A007615.
 * @author Sean A. Irvine
 */
public class A007498 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN == 1) {
        return Z.ONE;
      }
      final Z c = Cyclotomic.cyclotomic(mN, 10);
      final Z n = Z.valueOf(mN);
      final Z p = c.divide(n.gcd(c));
      if (p.isProbablePrime()) {
        return n;
      }
    }
  }
}

