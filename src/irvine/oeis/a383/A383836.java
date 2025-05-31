package irvine.oeis.a383;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A383836 Integers k such that d*2^k + k/d is prime for some divisor d of k.
 * @author Sean A. Irvine
 */
public class A383836 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      for (final Z d : Jaguar.factor(mN).divisors()) {
        if (d.shiftLeft(mN).add(mN / d.longValue()).isProbablePrime()) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
