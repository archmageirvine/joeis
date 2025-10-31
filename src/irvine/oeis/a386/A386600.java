package irvine.oeis.a386;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A386600 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A386600 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    long cnt = 0;
    Z q = p;
    while (!q.equals(Z.TWO)) {
      q = mPrime.prevPrime(q);
      if (Predicates.SQUARE.is(p.subtract(q))) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
