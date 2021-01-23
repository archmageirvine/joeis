package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015893 Numbers k such that k | 7^k + 7.
 * @author Sean A. Irvine
 */
public class A015893 implements Sequence {

  private long mN = 0;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mT = mT.multiply(7);
      if (++mN <= 2 || mN == 4 || mT.mod(mN) == mN - 7) {
        return Z.valueOf(mN);
      }
    }
  }
}
