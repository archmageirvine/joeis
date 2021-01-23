package irvine.oeis.a036;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036879 If n = (p_1)^(m_1)...(p_k)^(m_k) then a(n) = (p_1)^((p_1)^(m_1) - 1)...(p_k)((p_k)^(m_k) - 1).
 * @author Sean A. Irvine
 */
public class A036879 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(p.pow(p.pow(fs.getExponent(p)).subtract(1)));
    }
    return prod;
  }
}
