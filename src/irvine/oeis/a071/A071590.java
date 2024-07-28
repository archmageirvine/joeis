package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071576.
 * @author Sean A. Irvine
 */
public class A071590 extends Sequence1 {

  private long mN = 9;

  @Override
  public Z next() {
    while (true) {
      if (Functions.REVERSE.l(++mN) < mN) {
        return Z.valueOf(mN);
      }
    }
  }
}

