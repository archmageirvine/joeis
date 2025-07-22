package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078839 Numbers k such that the binary expansion of 3^k has the same number of 0's and 1's.
 * @author Sean A. Irvine
 */
public class A078839 extends Sequence1 {

  private Z mT = Z.THREE;
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mT = mT.multiply(3);
      if (mT.bitCount() * 2 == mT.bitLength()) {
        return Z.valueOf(mN);
      }
    }
  }
}
