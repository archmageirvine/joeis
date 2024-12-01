package irvine.oeis.a073;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073490 Number of prime gaps in factorization of n.
 * @author Sean A. Irvine
 */
public class A073490 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z[] p = Jaguar.factor(mN).toZArray();
    if (p.length <= 1) {
      return Z.ZERO;
    }
    long cnt = 0;
    boolean wasGap = false;
    for (Z q = mPrime.nextPrime(p[0]); q.compareTo(p[p.length - 1]) < 0; q = mPrime.nextPrime(q)) {
      if (!mN.mod(q).isZero()) {
        if (!wasGap) {
          ++cnt;
          wasGap = true;
        }
      } else {
        wasGap = false;
      }
    }
    return Z.valueOf(cnt);
  }
}
