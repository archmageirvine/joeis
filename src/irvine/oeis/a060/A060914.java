package irvine.oeis.a060;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060914 Integers i &gt; 1 for which there are two primes p such that i is a solution mod p of x^3 = 2.
 * @author Sean A. Irvine
 */
public class A060914 extends Sequence1 {

  private long mN = 6;

  @Override
  public Z next() {
    while (true) {
      int c = 0;
      for (final Z p : Jaguar.factor(Z.valueOf(++mN).pow(3).subtract(2)).toZArray()) {
        if (p.longValueExact() > mN && ++c > 2) {
          break;
        }
      }
      if (c == 2) {
        return Z.valueOf(mN);
      }
    }
  }
}
