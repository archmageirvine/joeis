package irvine.oeis.a045;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045769 Numbers k such that sigma(k) == 4 (mod k).
 * @author Sean A. Irvine
 */
public class A045769 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN == 1 || Cheetah.factor(mN).sigma().mod(mN) == 4) {
        return Z.valueOf(mN);
      }
    }
  }
}
