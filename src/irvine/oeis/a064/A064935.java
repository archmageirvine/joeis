package irvine.oeis.a064;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064935 Numbers k such that (k+3)^(k+2) mod (k+1) = k.
 * @author Sean A. Irvine
 */
public class A064935 extends Sequence1 {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (LongUtils.modPow(mN + 3, mN + 2, mN + 1) == mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
