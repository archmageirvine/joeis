package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075493 Numbers k such that (sum of digits of k) &gt; (number of divisors of k).
 * @author Sean A. Irvine
 */
public class A075493 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      if (Functions.DIGIT_SUM.l(++mN) > Functions.SIGMA0.l(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

