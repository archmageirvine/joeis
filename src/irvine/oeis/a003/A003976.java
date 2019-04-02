package irvine.oeis.a003;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * A003976 M&#246;bius transform of A003963 (with alternate 0's omitted).
 * @author Sean A. Irvine
 */
public class A003976 extends A003963 {

  private long mN = -1;
  {
    pi(Z.TWO);
  }

  @Override
  public Z next() {
    mN += 2;
    final FactorSequence fs = Cheetah.factor(mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final Z q = pi(p);
      prod = prod.multiply(q.pow(fs.getExponent(p) - 1).multiply(q.subtract(1)));
    }
    return prod;
  }
}
