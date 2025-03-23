package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000217;

/**
 * A036301.
 * @author Sean A. Irvine
 */
public class A076172 extends Sequence1 {

  private final Sequence mT = new A000217().skip();
  private Z mRecord = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z tr = mT.next();
      final Z s0 = Functions.SIGMA0.z(tr);
      if (s0.compareTo(mRecord) > 0 && Predicates.TRIANGULAR.is(s0)) {
        mRecord = s0;
        return tr;
      }
    }
  }
}

