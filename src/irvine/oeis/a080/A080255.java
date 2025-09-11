package irvine.oeis.a080;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A080255 Antisquares: of the form a*p^k where p is prime, k is odd and a is nonsquare modulo p.
 * @author Sean A. Irvine
 */
public class A080255 extends Sequence1 {

  private long mN = 5;

  private boolean is(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      if ((e & 1) == 1) {
        final long a = n / p.pow(e).longValue();
        if (!ZUtils.isQuadraticResidue(Z.valueOf(a), p)) {
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

