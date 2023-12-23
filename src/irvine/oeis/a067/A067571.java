package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A067571 Numbers n such that determinant[{{n,phi(n)},{n+1,phi(n+1)}}]is a perfect square.
 * @author Sean A. Irvine
 */
public class A067571 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 1;
  private Z mA10 = Z.ONE;
  private Z mA11 = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      final Z a00 = mA10;
      final Z a01 = mA11;
      final FactorSequence fs = Jaguar.factor(++mN);
      mA10 = Z.valueOf(mN);
      mA11 = fs.phi();
      final Z det = a00.multiply(mA11).subtract(a01.multiply(mA10));
      if (det.isSquare()) {
        return Z.valueOf(mN - 1);
      }
      if (mVerbose && mN % 1000000 == 2) {
        StringUtils.message("Search completed to " + (mN - 1));
      }
    }
  }
}
