package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A067564 Numbers n such that determinant[{{n, phi(n), sigma(n)}, {n+1, phi(n+1), sigma(n+1)}, {n+2, phi(n+2), sigma(n+2)}] is a nonnegative cube.
 * @author Sean A. Irvine
 */
public class A067564 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 2;
  private Z mA10 = Z.ONE;
  private Z mA11 = Z.ONE;
  private Z mA12 = Z.ONE;
  private Z mA20 = Z.TWO;
  private Z mA21 = Z.ONE;
  private Z mA22 = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      final Z a00 = mA10;
      final Z a01 = mA11;
      final Z a02 = mA12;
      mA10 = mA20;
      mA11 = mA21;
      mA12 = mA22;
      final FactorSequence fs = Jaguar.factor(++mN);
      mA20 = Z.valueOf(mN);
      mA21 = fs.phi();
      mA22 = fs.sigma();
      // | a b c |
      // | d e f | = aei + bfg + cdh - ceg - bdi - afh
      // | g h i |
      final Z aei = a00.multiply(mA11).multiply(mA22);
      final Z bfg = a01.multiply(mA12).multiply(mA20);
      final Z cdh = a02.multiply(mA10).multiply(mA21);
      final Z ceg = a02.multiply(mA11).multiply(mA20);
      final Z bdi = a01.multiply(mA10).multiply(mA22);
      final Z afh = a00.multiply(mA12).multiply(mA21);
      final Z j = aei.add(bfg).add(cdh);
      final Z k = ceg.add(bdi).add(afh);
      final Z i = j.subtract(k);
      if (i.signum() >= 0 && i.root(3).auxiliary() == 1) {
        return Z.valueOf(mN - 2);
      }
      if (mVerbose && mN % 1000000 == 2) {
        StringUtils.message("Search completed to " + (mN - 2));
      }
    }
  }
}
