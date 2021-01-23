package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015903 Numbers n such that n | 11^n + 11.
 * @author Sean A. Irvine
 */
public class A015903 implements Sequence {

  private long mN = 0;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mT = mT.multiply(11);
      if ((mT.mod(++mN) + 11) % mN == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
