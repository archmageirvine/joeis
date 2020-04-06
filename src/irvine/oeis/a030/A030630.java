package irvine.oeis.a030;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030630 Numbers with 12 divisors.
 * @author Sean A. Irvine
 */
public class A030630 implements Sequence {

  private static final Z Z12 = Z.valueOf(12);
  private long mN = 59;

  @Override
  public Z next() {
    while (true) {
      if (Z12.equals(Cheetah.factor(++mN).sigma0())) {
        return Z.valueOf(mN);
      }
    }
  }
}
