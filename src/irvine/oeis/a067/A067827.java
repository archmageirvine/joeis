package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067827 Even numbers k such that k/2 is nonprime and sigma(k+1) &gt; sigma(k).
 * @author Sean A. Irvine
 */
public class A067827 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (!mPrime.isPrime(mN / 2) && Jaguar.factor(mN + 1).sigma().compareTo(Jaguar.factor(mN).sigma()) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
