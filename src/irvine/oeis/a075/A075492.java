package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075492 Sum of digits of n &lt; number of divisors of n.
 * @author Sean A. Irvine
 */
public class A075492 extends Sequence1 {

  private long mN = 9;

  @Override
  public Z next() {
    while (true) {
      if (Functions.DIGIT_SUM.l(++mN) < Functions.SIGMA0.l(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

