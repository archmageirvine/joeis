package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a069.A069359;

/**
 * A054377 Primary pseudoperfect numbers: numbers n &gt; 1 such that 1/n + sum 1/p = 1, where the sum is over the primes p | n.
 * @author Sean A. Irvine
 */
public class A054377 extends A069359 {

  // Useless for larger terms.

  @Override
  public Z next() {
    while (true) {
      if (super.next().longValueExact() == mN - 1 && mN != 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
