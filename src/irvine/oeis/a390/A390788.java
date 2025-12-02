package irvine.oeis.a390;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390788 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A390788 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (2 * mN - Functions.PREV_PRIME.l(2 * mN) < Functions.NEXT_PRIME.l(2 * mN) - 2 * mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
