package irvine.oeis.a030;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030633 Numbers with 15 divisors.
 * @author Sean A. Irvine
 */
public class A030633 implements Sequence {

  private static final Z Z15 = Z.valueOf(15);
  private long mN = 143;

  @Override
  public Z next() {
    while (true) {
      if (Z15.equals(Cheetah.factor(++mN).sigma0())) {
        return Z.valueOf(mN);
      }
    }
  }
}
