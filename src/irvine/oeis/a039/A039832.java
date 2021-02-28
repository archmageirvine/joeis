package irvine.oeis.a039;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039832 Numbers k such that k and k+1 both have 4 divisors.
 * @author Sean A. Irvine
 */
public class A039832 implements Sequence {

  private long mN = 13;

  @Override
  public Z next() {
    while (true) {
      if (Z.FOUR.equals(Cheetah.factor(++mN).sigma0()) && Z.FOUR.equals(Cheetah.factor(mN + 1).sigma0())) {
        return Z.valueOf(mN);
      }
    }
  }
}
