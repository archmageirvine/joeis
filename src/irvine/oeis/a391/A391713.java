package irvine.oeis.a391;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391713 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A391713 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long cnt = 0;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      if (!Predicates.SQUARE_FREE.is(d) && !Predicates.SQUAREFUL.is(d)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
