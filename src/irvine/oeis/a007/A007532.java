package irvine.oeis.a007;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007532 Handsome numbers: sum of positive powers of its digits; a(n) = Sum_{i=1..k} d[i]^e[i] where d[1..k] are the decimal digits of a(n), e[i] &gt; 0.
 * @author Sean A. Irvine
 */
public class A007532 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Predicates.HANDSOME.is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
