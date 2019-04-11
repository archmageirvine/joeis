package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015904 Numbers k such that k | <code>12^k + 12</code>.
 * @author Sean A. Irvine
 */
public class A015904 implements Sequence {

  private long mN = 0;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mT = mT.multiply(12);
      if ((mT.mod(++mN) + 12) % mN == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
