package irvine.oeis.a075;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075169.
 * @author Sean A. Irvine
 */
public class A075175 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z res = Z.ZERO;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      final int k = Functions.PRIME_PI.i(p);
      int pos = Functions.TRIANGULAR.i(k - 1);
      for (int j = 0, i = k; j < e; ++j, pos += ++i) {
        res = res.setBit(pos);
      }
    }
    return res;
  }
}
