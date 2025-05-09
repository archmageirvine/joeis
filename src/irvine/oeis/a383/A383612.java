package irvine.oeis.a383;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A383612 allocated for Ryan Jean.
 * @author Sean A. Irvine
 */
public class A383612 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final Z f = Functions.FACTORIAL.z(++mN);
      final long v2 = f.makeOdd().auxiliary() + 2;
      final long p = Functions.PREV_PRIME.l(mN + 1);
      if (v2 < Functions.VALUATION.l(f, p) + p) {
        return Z.valueOf(mN);
      }
    }
  }
}

