package irvine.oeis.a032;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032448 Smallest prime <code>== -1</code> modulo <code>prime(n)</code>.
 * @author Sean A. Irvine
 */
public class A032448 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    long q = 2;
    while (q % mP != mP - 1) {
      q = mPrime.nextPrime(q);
    }
    return Z.valueOf(q);
  }
}
