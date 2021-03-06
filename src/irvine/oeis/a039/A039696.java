package irvine.oeis.a039;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039696 If n = Product (p_j^k_j) then a(n) = Product (p_j) + Product (k_j).
 * @author Sean A. Irvine
 */
public class A039696 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    Z p1 = Z.ONE;
    Z p2 = Z.ONE;
    for (final Z p : fs.toZArray()) {
      p1 = p1.multiply(p);
      p2 = p2.multiply(fs.getExponent(p));
    }
    return p1.add(p2);
  }
}
