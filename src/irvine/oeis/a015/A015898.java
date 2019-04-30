package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015898 Numbers k such that <code>k | 9^k + 9</code>.
 * @author Sean A. Irvine
 */
public class A015898 implements Sequence {

  private long mN = 0;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mT = mT.multiply(9);
      if ((mT.mod(++mN) + 9) % mN == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
