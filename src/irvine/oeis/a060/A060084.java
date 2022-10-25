package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.group.IntegersMod;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060084 a(n) is the least prime not a primitive root of n-th prime.
 * @author Sean A. Irvine
 */
public class A060084 extends Sequence1 {

  protected final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    final Z p1 = mP.subtract(1);
    final IntegersMod r = new IntegersMod(mP);
    for (Z q = Z.TWO; q.compareTo(mP) < 0; q = mPrime.nextPrime(q)) {
      if (r.ord(q).compareTo(p1) < 0) {
        return q;
      }
    }
    return mP;
  }
}
