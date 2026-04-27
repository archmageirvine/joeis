package irvine.oeis.a395;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395254 allocated for Jean-Marc Rebert.
 * @author Sean A. Irvine
 */
public class A395254 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private Z mF = Z.ONE;
  private long mP = 2;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    long q = mPrime.nextPrime(mP);
    while (!Z.valueOf(q).add(mP).modMultiply(q - mP, mF).isZero()) {
      mP = q;
      q = mPrime.nextPrime(q);
    }
    return Z.valueOf(mP);
  }
}
