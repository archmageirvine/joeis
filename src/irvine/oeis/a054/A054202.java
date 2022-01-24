package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054200.
 * @author Sean A. Irvine
 */
public class A054202 implements Sequence {

  private int mN = 0;
  private Z mF = Z.ONE;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    final Z oldF = mF;
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    mSum = mSum.add(Z.valueOf(mN).pow(mN).divide(mF));
    return mSum.multiply(oldF);
  }
}

