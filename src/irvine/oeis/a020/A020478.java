package irvine.oeis.a020;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020478 Number of singular 2 X 2 matrices over Z(n) (i.e., with determinant = 0).
 * @author Sean A. Irvine
 */
public class A020478 extends Sequence1 {

  protected long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z a = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      final Z b = p.pow(e);
      a = a.multiply(p.pow(2L * e - 1).multiply(b.multiply(p).add(b).subtract(1)));
    }
    return a;
  }
}
