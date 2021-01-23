package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A034087 Numbers divisible by the sum of the squares of their digits.
 * @author Sean A. Irvine
 */
public class A034087 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN % ZUtils.digitSumSquares(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

