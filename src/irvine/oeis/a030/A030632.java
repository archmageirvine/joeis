package irvine.oeis.a030;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030632 Numbers with 14 divisors.
 * @author Sean A. Irvine
 */
public class A030632 implements Sequence {

  private static final Z Z14 = Z.valueOf(14);
  private long mN = 191;

  @Override
  public Z next() {
    while (true) {
      if (Z14.equals(Cheetah.factor(++mN).sigma0())) {
        return Z.valueOf(mN);
      }
    }
  }
}
