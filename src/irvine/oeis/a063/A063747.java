package irvine.oeis.a063;

import java.util.ArrayList;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A063747 Sign of n-th coefficient of power series for 1/Gamma(1-x) where Gamma is the Gamma function.
 * @author Sean A. Irvine
 */
public class A063747 extends Sequence0 {

  // See https://dlmf.nist.gov/5.7 for expansion of 1/Gamma(z)

  private int mN = -1;
  private long mSign = -1;
  private final ArrayList<CR> mC = new ArrayList<>();

  @Override
  public Z next() {
    if (++mN == 0) {
      mC.add(CR.ONE);
    } else if (mN == 1) {
      mC.add(CR.GAMMA);
    } else {
      CR s = mC.get(mN - 1).multiply(CR.GAMMA);
      for (int j = 2; j <= mN; ++j) {
        s = s.signedAdd((j & 1) == 1, Zeta.zeta(j).multiply(mC.get(mN - j)));
      }
      mC.add(s.divide(CR.valueOf(mN)));
    }
    mSign *= -1;
    return Z.valueOf(mC.get(mN).signum() * mSign);
  }
}
