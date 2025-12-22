package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391354 Numbers k such that 4*k - (greatest prime &lt; 4*k) &lt; (least prime &gt; 4*k) - 4*k.
 * @author Sean A. Irvine
 */
public class A391354 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (4 * mN - Functions.PREV_PRIME.l(4 * mN) < Functions.NEXT_PRIME.l(4 * mN) - 4 * mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
