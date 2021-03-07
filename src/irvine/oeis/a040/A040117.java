package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A040117 Primes congruent to 5 (mod 12). Also primes p such that x^4 = 9 has no solution mod p.
 * @author Sean A. Irvine
 */
public class A040117 implements Sequence {

  private Z mN = Z.valueOf(-7);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(12);
      if (mN.isProbablePrime()) {
        return mN;
      }
    }
  }
}
