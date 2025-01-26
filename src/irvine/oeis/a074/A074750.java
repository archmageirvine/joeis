package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074750 Numbers k such that (largest prime dividing k) = (number of anti-divisors of k).
 * @author Sean A. Irvine
 */
public class A074750 extends Sequence1 {

  private long mN = 7;

  @Override
  public Z next() {
    while (true) {
      if (Functions.GPF.l(++mN) == Functions.ANTISIGMA0.l(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
