package irvine.oeis.a073;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a005.A005117;

/**
 * A073486 Squarefree numbers having at least one prime gap.
 * @author Sean A. Irvine
 */
public class A073486 extends A005117 {

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      final Z[] p = Jaguar.factor(n).toZArray();
      if (p.length > 1) {
        for (Z q = mPrime.nextPrime(p[0]); q.compareTo(p[p.length - 1]) < 0; q = mPrime.nextPrime(q)) {
          if (!n.mod(q).isZero()) {
            return n;
          }
        }
      }
    }
  }
}
