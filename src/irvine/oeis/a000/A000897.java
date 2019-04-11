package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000897 <code>a(n) = (4*n)! / ((2*n)!*n!^2)</code>.
 * @author Sean A. Irvine
 */
public class A000897 implements Sequence {

  private long mN = -1;
  private Z mF4 = Z.ONE;
  private Z mF2 = Z.ONE;
  private Z mF1 = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mF1 = mF1.multiply(mN);
      mF2 = mF2.multiply(2 * mN * (2 * mN - 1));
      mF4 = mF4.multiply(4 * mN * (4 * mN - 1)).multiply((4 * mN - 2) * (4 * mN - 3));
    }
    return mF4.divide(mF2).divide(mF1).divide(mF1);
  }
}

