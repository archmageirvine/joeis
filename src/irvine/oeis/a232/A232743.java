package irvine.oeis.a232;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A232743 Numbers n for which the largest m such that (m-1)! divides n is a composite number &gt; 5.
 * @author Sean A. Irvine
 */
public class A232743 implements Sequence {

  private final Fast mPrime = new Fast();
  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      mN += 120;
      long f = 1;
      long m = 1;
      while (mN % f == 0) {
        f *= ++m;
      }
      if (m > 5 && !mPrime.isPrime(m)) {
        return Z.valueOf(mN);
      }
    }
  }
}
