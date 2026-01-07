package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392062 Numbers k such that every prime factor of the sum of decimal digits of k is greater than every prime factor of k.
 * @author Sean A. Irvine
 */
public class A392062 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN % 3 != 0) {
        final long d = Functions.DIGIT_SUM.l(mN);
        if (d == 1 || Functions.LPF.l(d) > Functions.GPF.l(mN)) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
