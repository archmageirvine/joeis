package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392114 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A392114 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (6 * mN - Functions.PREV_PRIME.l(6 * mN) == Functions.NEXT_PRIME.l(6 * mN) - 6 * mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
