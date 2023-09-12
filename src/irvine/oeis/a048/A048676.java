package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Puma;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048676 Binary encoding of factorizations, alternative 2, a(n) = bef2(n);.
 * @author Sean A. Irvine
 */
public class A048676 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    final FactorSequence fs = Jaguar.factor(++mN);
    for (final Z p : fs.toZArray()) {
      sum = sum.add(Z.ONE.shiftLeft(fs.getExponent(p) + Puma.primePi(p)));
    }
    return sum.divide(4);
  }
}

