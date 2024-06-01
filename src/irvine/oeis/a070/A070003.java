package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070003 Numbers divisible by the square of their largest prime factor.
 * @author Sean A. Irvine
 */
public class A070003 extends Sequence1 {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final long gpf = Functions.GPF.l(++mN);
      if (mN % (gpf * gpf) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
