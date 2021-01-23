package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015902 Numbers k such that k | 10^k + 10.
 * @author Sean A. Irvine
 */
public class A015902 implements Sequence {

  private long mN = 0;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mT = mT.multiply(10);
      if ((mT.mod(++mN) + 10) % mN == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
