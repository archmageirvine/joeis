package irvine.oeis.a033;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033942 Positive integers with at least 3 prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A033942 extends Sequence1 {

  private long mN = 7;

  @Override
  public Z next() {
    while (true) {
      if (Functions.BIG_OMEGA.l(++mN) >= 3) {
        return Z.valueOf(mN);
      }
    }
  }
}
