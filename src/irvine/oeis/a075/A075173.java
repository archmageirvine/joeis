package irvine.oeis.a075;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075173 Prime factorization of n encoded by interleaving successive prime exponents in unary to bit-positions given by columns of A075300.
 * @author Sean A. Irvine
 */
public class A075173 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z res = Z.ZERO;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      final int k = Functions.PRIME_PI.i(p);
      if (k > 31) {
        throw new UnsupportedOperationException();
      }
      final int step = 1 << k;
      int pos = (step >>> 1) - 1;
      for (int j = 0; j < e; ++j, pos += step) {
        res = res.setBit(pos);
      }
    }
    return res;
  }
}
