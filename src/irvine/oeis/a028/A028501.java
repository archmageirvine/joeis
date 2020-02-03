package irvine.oeis.a028;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028501.
 * @author Sean A. Irvine
 */
public class A028501 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long sigma = Cheetah.factor(++mN).sigma().longValueExact();
      final long s = sigma - mN - 1;
      if (18 * s == mN - 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
