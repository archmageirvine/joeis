package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073585 Square root of n has the same nonzero digit in each of the first 4 places to the right of the decimal point.
 * @author Sean A. Irvine
 */
public class A073585 extends Sequence1 {

  private long mN = 5167;

  @Override
  public Z next() {
    while (true) {
      final long t = CR.valueOf(++mN).sqrt().frac().multiply(10000).floor().longValue();
      if (t >= 1111 && Predicates.REPDIGIT.is(t)) {
        return Z.valueOf(mN);
      }
    }
  }
}
