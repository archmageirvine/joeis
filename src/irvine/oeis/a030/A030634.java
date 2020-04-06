package irvine.oeis.a030;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030634 Numbers with 16 divisors.
 * @author Sean A. Irvine
 */
public class A030634 implements Sequence {

  private static final Z Z16 = Z.valueOf(16);
  private long mN = 119;

  @Override
  public Z next() {
    while (true) {
      if (Z16.equals(Cheetah.factor(++mN).sigma0())) {
        return Z.valueOf(mN);
      }
    }
  }
}
