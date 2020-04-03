package irvine.oeis.a030;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030515 Numbers with exactly 6 divisors.
 * @author Sean A. Irvine
 */
public class A030515 implements Sequence {

  private long mN = 11;

  @Override
  public Z next() {
    while (true) {
      if (Z.SIX.equals(Cheetah.factor(++mN).sigma0())) {
        return Z.valueOf(mN);
      }
    }
  }
}

