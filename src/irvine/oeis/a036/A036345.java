package irvine.oeis.a036;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036345 Divisible by its 'even' sum of prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A036345 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z sum = Cheetah.factor(++mN).sopfr();
      if (sum.isEven() && mN % sum.longValueExact() == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
