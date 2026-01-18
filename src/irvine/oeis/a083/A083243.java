package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083243 Numbers k for which there are more divisors and coprimes than other numbers less than k: A045763(k) &lt; A073757(k) or A045763(k) &lt; k/2 or A073757(k) &gt; k/2.
 * @author Sean A. Irvine
 */
public class A083243 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (2 * (Functions.SIGMA0.l(++mN) + Functions.PHI.l(mN) - 1) > mN) {
        return Z.valueOf(mN);
      }
    }
  }
}

