package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082719 Numbers k such that (89*10^(k-1) + 1)/9 is a depression prime.
 * @author Sean A. Irvine
 */
public class A082719 extends Sequence1 {

  private long mN = 1;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mT = mT.multiply(10);
      if (mT.multiply(89).add(1).divide(9).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
