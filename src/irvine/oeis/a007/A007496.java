package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007496 Numbers n such that the decimal expansions of 2^n and 5^n contain no 0's (probably 33 is last term).
 * @author Sean A. Irvine
 */
public class A007496 extends Sequence1 {

  private int mN = -1;
  private Z mFives = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      if (!Z.ONE.shiftLeft(++mN).toString().contains("0") && !mFives.toString().contains("0")) {
        mFives = mFives.multiply(5);
        return Z.valueOf(mN);
      }
      mFives = mFives.multiply(5);
    }
  }
}
