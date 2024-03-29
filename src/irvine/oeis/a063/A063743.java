package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063743 Numbers n such that n and Omega(n) are relatively prime, where Omega(n) is the number of prime divisors of n (with repetition).
 * @author Sean A. Irvine
 */
public class A063743 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (LongUtils.gcd(Jaguar.factor(++mN).bigOmega(), mN) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}

