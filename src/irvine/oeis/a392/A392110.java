package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392110 Numbers k such that 5*k - (greatest prime &lt; 5*n) &lt; (least prime &gt; 5*n) - 5*k.
 * @author Sean A. Irvine
 */
public class A392110 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (5 * mN - Functions.PREV_PRIME.l(5 * mN) < Functions.NEXT_PRIME.l(5 * mN) - 5 * mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
