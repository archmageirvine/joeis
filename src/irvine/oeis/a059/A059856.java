package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a001.A001620;

/**
 * A059856 Write down decimal expansion of Euler-Mascheroni constant gamma (A001620); divide up into minimal chunks so that chunks have increasing length and do not begin with zero.
 * @author Sean A. Irvine
 */
public class A059856 extends A001620 {

  private Z mA = super.next();
  private int mL = 0;

  @Override
  public Z next() {
    int k = 0;
    Z res = Z.ZERO;
    while (k <= mL || mA.isZero()) {
      res = res.multiply(10).add(mA);
      mA = super.next();
      ++k;
    }
    mL = k;
    return res;
  }
}
