package irvine.oeis.a030;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030626 Numbers with exactly 8 divisors.
 * @author Sean A. Irvine
 */
public class A030626 implements Sequence {

  private long mN = 11;

  @Override
  public Z next() {
    while (true) {
      if (Z.EIGHT.equals(Cheetah.factor(++mN).sigma0())) {
        return Z.valueOf(mN);
      }
    }
  }
}
