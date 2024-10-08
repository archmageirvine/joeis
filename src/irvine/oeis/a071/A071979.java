package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071979 Left diagonal of A071977.
 * @author Sean A. Irvine
 */
public class A071979 extends Sequence1 {

  private int mN = 0;
  private long mA = 1;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    long res = 0;
    for (int k = 0; k < mN; ++k) {
      while (Functions.GCD.l(mN, ++mA) > 1) {
        // do nothing
      }
      if (k == 0) {
        res = mA;
      }
    }
    return Z.valueOf(res);
  }
}
