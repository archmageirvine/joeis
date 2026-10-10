package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a001.A001359;

/**
 * A086827 Smaller member of a twin prime pair such that the sum sets a record for number of prime divisors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A086827 extends A001359 {

  private Z mBest = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z bigOmega = Functions.BIG_OMEGA.z(p.multiply(2).add(2));
      if (bigOmega.compareTo(mBest) > 0) {
        mBest = bigOmega;
        return p;
      }
    }
  }
}

