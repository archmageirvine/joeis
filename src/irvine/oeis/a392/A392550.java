package irvine.oeis.a392;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A392550 allocated for Juri-Stepan Gerasimov.
 * @author Sean A. Irvine
 */
public class A392550 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      ++k;
      int cnt = 0;
      for (final Z dd : Jaguar.factor(k).divisors()) {
        final long d = dd.longValue();
        if (Functions.SIGMA0.l(k / d + d) == Functions.SIGMA0.l(dd.multiply(k)) && ++cnt > mN) {
          break;
        }
      }
      if (cnt == mN) {
        return Z.valueOf(k);
      }
    }
  }
}
