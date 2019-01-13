package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007593.
 * @author Sean A. Irvine
 */
public class A007593 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (true) {
      final long sigma = Cheetah.factor(++mN).sigma().longValueExact();
      final long s = sigma - mN - 1;
      if (2 * s == mN - 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
