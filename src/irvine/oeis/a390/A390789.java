package irvine.oeis.a390;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390789 Numbers k such that 2*k - (greatest prime &lt; 2*k) = (least prime &gt; 2*k) - 2*k.
 * @author Sean A. Irvine
 */
public class A390789 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (2 * mN - Functions.PREV_PRIME.l(2 * mN) == Functions.NEXT_PRIME.l(2 * mN) - 2 * mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
