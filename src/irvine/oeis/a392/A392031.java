package irvine.oeis.a392;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392031 allocated for Juri-Stepan Gerasimov.
 * @author Sean A. Irvine
 */
public class A392031 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      int cnt = 0;
      for (final Z dd : Jaguar.factor(++k).divisors()) {
        final long d = dd.longValue();
        if (Functions.SIGMA1.l(k / d + d) == Functions.SIGMA1.l(d) && ++cnt > mN) {
          break;
        }
      }
      if (cnt == mN) {
        return Z.valueOf(k);
      }
    }
  }
}
