package irvine.oeis.a062;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062021 a(n) = Sum_{i=1..n} Sum_{j=1..i} (prime(i)^2 - prime(j)^2).
 * @author Sean A. Irvine
 */
public class A062021 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private Z mA = Z.ZERO;
  private Z mB = null;
  private long mN = 1;
  private Z mP = Z.THREE;

  @Override
  public Z next() {
    if (mB == null) {
      mB = Z.ZERO;
    } else if (mB.isZero()) {
      mB = Z.FIVE;
    } else {
      final Z q = mP;
      mP = mPrime.nextPrime(mP);
      final Z t = mB.multiply2().subtract(mA).add(mP.square().subtract(q.square()).multiply(++mN));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

