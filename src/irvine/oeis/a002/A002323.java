package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.group.IntegersMod;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A002323 ((2^m - 1) / p) mod p, where p = prime(n) and m = ord(2,p).
 * @author Sean A. Irvine
 */
public class A002323 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  private int order(final Z base, final Z p) {
    return new IntegersMod(p).ord(base).intValue();
  }

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    final int m = order(Z.TWO, mP);
    return Z.ONE.shiftLeft(m).subtract(1).divide(mP).mod(mP);
  }
}
