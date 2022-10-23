package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A035060 Numbers k such that 2^k does not contain the digit 5 (probably finite).
 * @author Sean A. Irvine
 */
public class A035060 extends Sequence1 {

  private Z mT = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (++mN == 0) {
        return Z.ZERO;
      }
      mT = mT.multiply2();
      if (mT.toString().indexOf('5') == -1) {
        return Z.valueOf(mN);
      }
    }
  }
}
