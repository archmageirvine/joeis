package irvine.oeis.a036;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036247 Numerator of fraction equal to the continued fraction [ 2, 3, 5, ...prime(n) ].
 * @author Sean A. Irvine
 */
public class A036247 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mA = Z.ZERO;
  private Z mB = Z.ONE;
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    final Z t = mB.multiply(mP).add(mA);
    mA = mB;
    mB = t;
    return mB;
  }
}

