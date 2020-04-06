package irvine.oeis.a030;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030627 Numbers with 9 divisors.
 * @author Sean A. Irvine
 */
public class A030627 implements Sequence {

  private long mN = 35;

  @Override
  public Z next() {
    while (true) {
      if (Z.NINE.equals(Cheetah.factor(++mN).sigma0())) {
        return Z.valueOf(mN);
      }
    }
  }
}
