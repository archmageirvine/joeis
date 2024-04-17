package irvine.oeis.a050;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050689 Composites whose sum of digits equals number of its prime factors, with multiplicity.
 * @author Sean A. Irvine
 */
public class A050689 extends Sequence1 {

  private long mN = 11;

  @Override
  public Z next() {
    while (true) {
      if (Functions.BIG_OMEGA.l(++mN) == Functions.DIGIT_SUM.l(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
