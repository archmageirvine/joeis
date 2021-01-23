package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015905 Numbers k such that k | 13^k + 13.
 * @author Sean A. Irvine
 */
public class A015905 implements Sequence {

  private long mN = 0;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mT = mT.multiply(13);
      if ((mT.mod(++mN) + 13) % mN == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
