package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071576.
 * @author Sean A. Irvine
 */
public class A071594 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Long.bitCount(++mN) == Functions.OMEGA.l(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

