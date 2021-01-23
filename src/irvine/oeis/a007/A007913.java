package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007913 Squarefree part of n: a(n) is the smallest positive number m such that n/m is a square.
 * @author Sean A. Irvine
 */
public class A007913 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    long prod = 1;
    for (final Z p : fs.toZArray()) {
      if ((fs.getExponent(p) & 1) == 1) {
        prod *= p.longValueExact();
      }
    }
    return Z.valueOf(prod);
  }
}
