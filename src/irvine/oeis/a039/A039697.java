package irvine.oeis.a039;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039697 a(n) = sum(p_j)*sum(k_j) where n = product(p_j^k_j).
 * @author Sean A. Irvine
 */
public class A039697 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final FactorSequence fs = Cheetah.factor(mN);
    Z s1 = Z.ZERO;
    Z s2 = Z.ZERO;
    for (final Z p : fs.toZArray()) {
      s1 = s1.add(p);
      s2 = s2.add(fs.getExponent(p));
    }
    return s1.multiply(s2);
  }
}
