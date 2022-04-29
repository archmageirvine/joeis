package irvine.oeis.a117;
// manually linrec/linrec2 at 2022-04-29 07:28
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A117661 Heptagonal numbers for which the product of the digits is also a heptagonal number.
 * @author Georg Fischer
 */
public class A117661 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mN == 0) {
        return Z.ZERO;
      }
      final Z hnn = Z.valueOf(mN).multiply(5 * mN - 3).divide2();
      // if type((3+sqrt(9+40*hnn))/10, integer)=true
      final Z h2 = ZUtils.digitProduct(hnn).multiply(40).add(9);
      if (h2.isSquare() && h2.sqrt().add(3).remainder(Z.TEN).isZero()) {
        return hnn;
      }
    }
  }
}
