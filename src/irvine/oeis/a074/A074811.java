package irvine.oeis.a074;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006420.
 * @author Sean A. Irvine
 */
public class A074811 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      if (Functions.SIGMA0.z(++k * mN).multiply(k).compareTo(p) <= 0) {
        return Z.valueOf(k);
      }
    }
  }
}
