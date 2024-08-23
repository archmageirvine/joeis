package irvine.oeis.a002;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002312 Arc-cotangent reducible numbers or non-St\u00f8rmer numbers: largest prime factor of k^2 + 1 is less than 2*k.
 * @author Sean A. Irvine
 */
public class A002312 extends Sequence1 {

  private Z mN = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!Predicates.STORMER.is(mN)) {
        return mN;
      }
    }
  }
}
