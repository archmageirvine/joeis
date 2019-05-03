package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.factor.prime.Fast;
import irvine.math.group.IntegersMod;

/**
 * A002323 <code>((2^m - 1) / p) mod</code> p, where p <code>= prime(n)</code> and m <code>= ord(2,p)</code>.
 * @author Sean A. Irvine
 */
public class A002323 implements Sequence {

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
