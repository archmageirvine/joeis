package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007496 Numbers n such that the decimal expansions of <code>2^n</code> and <code>5^n</code> contain no <code>0's (probably 33</code> is last <code>term)</code>.
 * @author Sean A. Irvine
 */
public class A007496 implements Sequence {

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
