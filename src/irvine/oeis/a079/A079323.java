package irvine.oeis.a079;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079323 First number in a sequence of 4 consecutive economical numbers.
 * @author Sean A. Irvine
 */
public class A079323 extends Sequence1 {

  private long mN = 179210311;

  @Override
  public Z next() {
    while (true) {
      if (Predicates.ECONOMICAL.is(++mN) && Predicates.ECONOMICAL.is(mN + 1) && Predicates.ECONOMICAL.is(mN + 2) && Predicates.ECONOMICAL.is(mN + 3)) {
        return Z.valueOf(mN);
      }
    }
  }
}
