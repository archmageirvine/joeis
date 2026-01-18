package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083244 k is in the sequence iff the number of numbers unrelated to k is larger than that of related ones[=divisors and coprimes] to k: A045763(k) &gt; A073757(k) or A045763(k) &gt; k/2 or A073757(k) &lt; k/2.
 * @author Sean A. Irvine
 */
public class A083244 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (2 * (Functions.SIGMA0.l(++mN) + Functions.PHI.l(mN) - 1) < mN) {
        return Z.valueOf(mN);
      }
    }
  }
}

