package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015888 Numbers k such that k | (3^k + 3).
 * @author Sean A. Irvine
 */
public class A015888 extends Sequence1 {

  private long mN = 0;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mT = mT.multiply(3);
      if (++mN <= 4 || mT.mod(mN) == mN - 3) {
        return Z.valueOf(mN);
      }
    }
  }
}

