package irvine.oeis.a072;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072510 Numbers n with property that n = product of first k divisors of n for some k.
 * @author Sean A. Irvine
 */
public class A072510 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      long prod = 1;
      for (final Z d : Jaguar.factor(++mN).divisorsSorted()) {
        prod *= d.longValueExact();
        if (prod >= mN) {
          if (prod == mN) {
            return Z.valueOf(mN);
          }
          break;
        }
      }
    }
  }
}
