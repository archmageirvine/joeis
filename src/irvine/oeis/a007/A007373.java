package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007373 Numbers k such that sigma(k+2) = sigma(k).
 * @author Sean A. Irvine
 */
public class A007373 implements Sequence {

  private long mN = 32;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Cheetah.factor(mN).sigma().equals(Cheetah.factor(mN + 2).sigma())) {
        return Z.valueOf(mN);
      }
    }
  }
}
