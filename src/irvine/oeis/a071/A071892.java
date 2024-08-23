package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071892 a(n) = lcm(A071888(n), n).
 * @author Sean A. Irvine
 */
public class A071892 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.TWO;
    }
    long m = mN;
    while (true) {
      if (Functions.GCD.l(++m, mN) > 1 && Predicates.SQUARE_FREE.is(m)) {
        return Functions.LCM.z(m, mN);
      }
    }
  }
}
