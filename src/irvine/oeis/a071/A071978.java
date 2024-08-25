package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071926.
 * @author Sean A. Irvine
 */
public class A071978 extends Sequence1 {

  private int mN = 0;
  private long mA = 1;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    for (int k = 0; k < mN; ++k) {
      while (Functions.GCD.l(mN, ++mA) > 1) {
        // do nothing
      }
    }
    return Z.valueOf(mA);
  }
}
