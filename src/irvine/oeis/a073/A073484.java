package irvine.oeis.a073;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a005.A005117;

/**
 * A073484 Number of gaps in factors of the n-th squarefree number.
 * @author Sean A. Irvine
 */
public class A073484 extends A005117 {

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    final Z n = super.next();
    final Z[] p = Jaguar.factor(n).toZArray();
    if (p.length <= 1) {
      return Z.ZERO;
    }
    long cnt = 0;
    boolean wasGap = false;
    for (Z q = mPrime.nextPrime(p[0]); q.compareTo(p[p.length - 1]) < 0; q = mPrime.nextPrime(q)) {
      if (!n.mod(q).isZero()) {
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
