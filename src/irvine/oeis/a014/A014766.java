package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A014766 Numbers k such that the 3k shuffle group does not accomplish a perfect shuffle.
 * @author Sean A. Irvine
 */
public class A014766 extends Sequence1 implements Conjectural {

  private long mN = 6;
  private long mT = 9;

  @Override
  public Z next() {
    while (true) {
      mN += 3;
      if (mN == mT) {
        mT *= 3;
        return Z.valueOf(mN);
      }
      if (mN % 12 == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
