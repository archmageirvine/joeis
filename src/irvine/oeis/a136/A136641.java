package irvine.oeis.a136;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A136641 a(n) = smallest positive integer that is coprime to n and has n positive divisors.
 * @author Sean A. Irvine
 */
public class A136641 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long q = 0;
    while (true) {
      if (LongUtils.gcd(mN, ++q) == 1 && Cheetah.factor(q).sigma0() == mN) {
        return Z.valueOf(q);
      }
    }
  }
}
