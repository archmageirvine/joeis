package irvine.oeis.a080;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080075 Proth numbers: of the form k*2^m + 1 for k odd, m &gt;= 1 and 2^m &gt; k.
 * @author Sean A. Irvine
 */
public class A080075 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (Predicates.PROTH.is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

