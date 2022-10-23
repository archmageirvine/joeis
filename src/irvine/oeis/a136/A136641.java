package irvine.oeis.a136;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A136641 a(n) is the smallest positive integer that is coprime to n and has n divisors.
 * @author Sean A. Irvine
 */
public class A136641 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long q = 0;
    while (true) {
      if (LongUtils.gcd(mN, ++q) == 1 && Jaguar.factor(q).sigma0AsLong() == mN) {
        return Z.valueOf(q);
      }
    }
  }
}
