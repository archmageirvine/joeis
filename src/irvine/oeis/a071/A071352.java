package irvine.oeis.a071;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A071013.
 * @author Sean A. Irvine
 */
public class A071352 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z p = super.next();
      if (Predicates.PRIME_POWER.is(p.add(mPrime.nextPrime(p)))) {
        return Z.valueOf(mN);
      }
    }
  }
}

