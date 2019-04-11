package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015897 Numbers k such that k | 8^k <code>+ 8</code>.
 * @author Sean A. Irvine
 */
public class A015897 implements Sequence {

  private long mN = 0;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mT = mT.shiftLeft(3);
      if ((mT.mod(++mN) + 8) % mN == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
