package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391355 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A391355 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (4 * mN - Functions.PREV_PRIME.l(4 * mN) == Functions.NEXT_PRIME.l(4 * mN) - 4 * mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
