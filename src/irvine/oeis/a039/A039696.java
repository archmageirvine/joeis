package irvine.oeis.a039;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039696 If n = Product (p_j^k_j) then a(n) = Product (p_j) + Product (k_j).
 * @author Sean A. Irvine
 */
public class A039696 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z p1 = Z.ONE;
    Z p2 = Z.ONE;
    for (final Z p : fs.toZArray()) {
      p1 = p1.multiply(p);
      p2 = p2.multiply(fs.getExponent(p));
    }
    return p1.add(p2);
  }
}
