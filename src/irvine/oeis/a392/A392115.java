package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392115 Numbers k such that 6*k - (greatest prime &lt; 6*n) &gt; (least prime &gt; 6*n) - 6*k.
 * @author Sean A. Irvine
 */
public class A392115 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (6 * mN - Functions.PREV_PRIME.l(6 * mN) > Functions.NEXT_PRIME.l(6 * mN) - 6 * mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
