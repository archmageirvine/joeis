package irvine.oeis.a076;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076201 a(n), for n &gt; 1, equals the least prime p such that p - a(n-1) is a cube, a(1)=2.
 * @author Sean A. Irvine
 */
public class A076201 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
    } else {
      Z p = mA;
      while (true) {
        p = mPrime.nextPrime(p);
        if (Predicates.CUBE.is(p.subtract(mA))) {
          mA = p;
          break;
        }
      }
    }
    return mA;
  }
}
