package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A049304 Numbers k such that k is a substring of 6^k.
 * @author Sean A. Irvine
 */
public class A049304 extends Sequence1 {

  private long mN = 0;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mT = mT.multiply(6);
      if (mT.toString().contains(String.valueOf(++mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
