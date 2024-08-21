package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071868.
 * @author Sean A. Irvine
 */
public class A071889 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    long m = mN;
    while (true) {
      final long g = Functions.GCD.l(++m, mN);
      if (g > 1 && Predicates.SQUARE_FREE.is(m)) {
        return Z.valueOf(g);
      }
    }
  }
}
