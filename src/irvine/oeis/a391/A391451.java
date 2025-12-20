package irvine.oeis.a391;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391451 allocated for Juri-Stepan Gerasimov.
 * @author Sean A. Irvine
 */
public class A391451 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final int omega = Functions.OMEGA.i(++mN);
      for (final Z d : Jaguar.factor(mN).divisors()) {
        if (Functions.OMEGA.i(d.add(mN / d.longValue())) == omega) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
