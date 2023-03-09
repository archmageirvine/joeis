package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A061712 Smallest prime with Hamming weight n (i.e., with exactly n 1's when written in binary).
 * @author Sean A. Irvine
 */
public class A061712 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z t = Z.ONE.shiftLeft(++mN).subtract(1);
    while (true) {
      if (t.isProbablePrime()) {
        return t;
      }
      t = ZUtils.swizzle(t);
    }
  }
}
