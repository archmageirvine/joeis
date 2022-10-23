package irvine.oeis.a005;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005148 Sequence of coefficients arising in connection with a rapidly converging series for Pi.
 * @author Sean A. Irvine
 */
public class A005148 extends Sequence0 {

  // After Broadhurst

  private final ArrayList<Z> mA = new ArrayList<>();
  private final ArrayList<Z> mB = new ArrayList<>();
  private int mN = -1;
  private Z mD = Z.ONE;
  private Z mE = Z.ZERO;
  private Z mG = Z.ZERO;

  @Override
  public Z next() {
    if (++mN == 0) {
      mA.add(Z.ZERO);
      mB.add(Z.ZERO);
    } else if (mN == 1) {
      mA.add(Z.ONE);
      mB.add(Z.ONE);
    } else {
      final Z c = mA.get(mN - 1).add(mG).multiply(48).add(mD.subtract(mE.multiply(32)).multiply(128));
      mE = mD;
      mD = c;
      final int i = (mN - 1) / 2;
      mG = Z.ZERO;
      Z h = Z.ZERO;
      for (int j = 1; j <= i; ++j) {
        mG = mG.add(mA.get(j).multiply(mA.get(mN - j)));
        h = h.add(mB.get(j).multiply(mB.get(mN - j)));
      }
      mG = mG.multiply(24);
      h = h.multiply(24);
      if ((mN & 1) == 0) {
        mG = mG.add(mA.get(mN / 2).square().multiply(12));
        h = h.add(mB.get(mN / 2).square().multiply(12));
      }
      final Z f = c.add(h.multiply(5)).divide(mN * (long) mN).subtract(mG);
      mA.add(f);
      mB.add(f.multiply(mN));
    }
    return mA.get(mN);
  }
}
