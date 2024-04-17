package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063737 Numbers n such that sum of digits of n is equal to the sum of the prime factors of n, counted with multiplicity.
 * @author Sean A. Irvine
 */
public class A063737 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SOPFR.l(++mN) == Functions.DIGIT_SUM.l(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
