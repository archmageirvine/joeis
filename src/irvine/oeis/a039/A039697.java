package irvine.oeis.a039;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039697 a(n) = Sum(p_j) * Sum(k_j) where n = Product(p_j^k_j).
 * @author Sean A. Irvine
 */
public class A039697 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final FactorSequence fs = Jaguar.factor(mN);
    Z s1 = Z.ZERO;
    Z s2 = Z.ZERO;
    for (final Z p : fs.toZArray()) {
      s1 = s1.add(p);
      s2 = s2.add(fs.getExponent(p));
    }
    return s1.multiply(s2);
  }
}
