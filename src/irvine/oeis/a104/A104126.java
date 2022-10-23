package irvine.oeis.a104;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A104126 a(n) = prime(n)^(prime(n)+1).
 * @author Sean A. Irvine
 */
public class A104126 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    return Z.valueOf(mP).pow(mP + 1);
  }
}
