package irvine.oeis.a048;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048946 Numbers k such that the product of divisors of k is a fifth power.
 * @author Sean A. Irvine
 */
public class A048946 implements Sequence {

  // After Charles R Greathouse IV

  private long mN = 0;
  private long mC = 1;
  private long mNextPower = 1;

  @Override
  public Z next() {
    while (true) {
      if (++mN == mNextPower) {
        mNextPower = ++mC * mC * mC * mC * mC;
        return Z.valueOf(mN);
      }
      if (Cheetah.factor(mN).sigma0().mod(5) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

