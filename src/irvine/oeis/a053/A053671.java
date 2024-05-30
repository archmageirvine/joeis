package irvine.oeis.a053;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053671 Least number coprime to n, n+1 and n+2.
 * @author Sean A. Irvine
 */
public class A053671 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long p = 5;
    while (Functions.GCD.l(mN, p) != 1 || Functions.GCD.l(mN + 1, p) != 1 || Functions.GCD.l(mN + 2, p) != 1) {
      p = mPrime.nextPrime(p);
    }
    return Z.valueOf(p);
  }
}
