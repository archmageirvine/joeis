package irvine.oeis.a053;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053674 Least number coprime to n, n+1, n+2, n+3, n+4 and n+5.
 * @author Sean A. Irvine
 */
public class A053674 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long p = 7;
    while (Functions.GCD.l(mN, p) != 1
      || Functions.GCD.l(mN + 1, p) != 1
      || Functions.GCD.l(mN + 2, p) != 1
      || Functions.GCD.l(mN + 3, p) != 1
      || Functions.GCD.l(mN + 4, p) != 1
      || Functions.GCD.l(mN + 5, p) != 1
    ) {
      p = mPrime.nextPrime(p);
    }
    return Z.valueOf(p);
  }
}
