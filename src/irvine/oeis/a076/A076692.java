package irvine.oeis.a076;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A076692 Numbers k such that average of prime(k) and prime(k+1) is a perfect square.
 * @author Sean A. Irvine
 */
public class A076692 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z p = super.next();
      if (Predicates.SQUARE.is(p.add(mPrime.nextPrime(p)).divide2())) {
        return Z.valueOf(mN);
      }
    }
  }
}
