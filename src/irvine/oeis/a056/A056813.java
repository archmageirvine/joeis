package irvine.oeis.a056;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a069.A069482;

/**
 * A056813 Largest non-unitary prime factor of LCM(1,...,n); that is, the largest prime which occurs to power &gt; 1 in prime factorization of LCM(1,..,n).
 * @author Sean A. Irvine
 */
public class A056813 extends A069482 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;
  private long mM = 4;

  @Override
  public Z next() {
    if (--mM <= 0) {
      mM = super.next().longValueExact();
      mP = mPrime.nextPrime(mP);
    }
    return mP;
  }
}

