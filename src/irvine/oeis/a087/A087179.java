package irvine.oeis.a087;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087179 a(n) = (...(((x1^x2)^x3)^x4)^...) where x1,x2,... are the exponents in the prime factorization of n, a(1) = 0.
 * @author Sean A. Irvine
 */
public class A087179 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    final FactorSequence fs = Jaguar.factor(mN);
    Z res = null;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      res = res == null ? Z.valueOf(e) : res.pow(e);
    }
    return res;
  }
}
