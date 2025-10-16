package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A388063.
 * @author Sean A. Irvine
 */
public class A389681 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Predicates.SQUARE.is(Z.valueOf(++mN).square().subtract(CR.valueOf(mN).divide(CR.PHI).round().square()))) {
        return Z.valueOf(mN);
      }
    }
  }
}

