package irvine.oeis.a030;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030636 Numbers with 18 divisors.
 * @author Sean A. Irvine
 */
public class A030636 implements Sequence {

  private static final Z Z18 = Z.valueOf(18);
  private long mN = 179;

  @Override
  public Z next() {
    while (true) {
      if (Z18.equals(Cheetah.factor(++mN).sigma0())) {
        return Z.valueOf(mN);
      }
    }
  }
}
