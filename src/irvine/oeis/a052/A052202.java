package irvine.oeis.a052;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052202 Numbers k such that the product of the logarithms of k's prime factors is greater than their sum.
 * @author Sean A. Irvine
 */
public class A052202 implements Sequence {

  private static final int TOLERANCE = -32;
  private long mN = 76;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      CR prod = CR.ONE;
      for (final Z p : fs.toZArray()) {
        final CR log = CR.valueOf(p).log().pow(fs.getExponent(p));
        prod = prod.multiply(log);
      }
      if (prod.compareTo(CR.valueOf(mN).log(), TOLERANCE) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
