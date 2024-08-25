package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071926.
 * @author Sean A. Irvine
 */
public class A071977 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private long mA = 1;

  @Override
  public Z next() {
    if (++mM >= mN) {
      if (++mN == 1) {
        return Z.ONE;
      }
      mM = 0;
    }
    while (Functions.GCD.l(mN, ++mA) > 1) {
      // do nothing
    }
    return Z.valueOf(mA);
  }
}
