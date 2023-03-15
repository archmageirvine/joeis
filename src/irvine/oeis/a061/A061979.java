package irvine.oeis.a061;

import irvine.factor.prime.Fast;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061979 Floor of arithmetic-geometric mean of n and prime(n).
 * @author Sean A. Irvine
 */
public class A061979 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    return CR.valueOf(mP).agm(CR.valueOf(++mN)).floor();
  }
}

