package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001816 Coefficients of x^n in Hermite polynomial H_{n+4}.
 * @author Sean A. Irvine
 */
public class A001816 implements Sequence {

  private long mN = 3;
  private Z mA = Z.valueOf(12);

  @Override
  public Z next() {
    if (++mN > 4) {
      mA = mA.multiply(2 * mN).divide(mN - 4);
    }
    return mA;
  }
}
