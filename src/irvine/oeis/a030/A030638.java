package irvine.oeis.a030;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030638 Numbers with 20 divisors.
 * @author Sean A. Irvine
 */
public class A030638 implements Sequence {

  private static final Z Z20 = Z.valueOf(20);
  private long mN = 239;

  @Override
  public Z next() {
    while (true) {
      if (Z20.equals(Cheetah.factor(++mN).sigma0())) {
        return Z.valueOf(mN);
      }
    }
  }
}
