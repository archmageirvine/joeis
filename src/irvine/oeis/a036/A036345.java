package irvine.oeis.a036;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036345 Divisible by its 'even' sum of prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A036345 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z sum = Jaguar.factor(++mN).sopfr();
      if (sum.isEven() && mN % sum.longValueExact() == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
