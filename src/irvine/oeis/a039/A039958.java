package irvine.oeis.a039;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.group.QuadraticFieldUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039958 Class number of maximal order in real quadratic field of radicand n.
 * @author Sean A. Irvine
 */
public class A039958 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final FactorSequence fs = Cheetah.factor(mN);
    if (fs.isSquareFree()) {
      final long disc = mN * ((mN & 3) > 1 ? 4 : 1);
      final Z d = Z.valueOf(disc);
      return QuadraticFieldUtils.fundamentalUnitNorm(d).multiply(QuadraticFieldUtils.classNumber(d));

    } else {
      Z prod = Z.ONE;
      for (final Z p : fs.toZArray()) {
        prod = prod.multiply(p.pow(fs.getExponent(p) / 2));
      }
      return prod;
    }
  }
}

