package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007592.
 * @author Sean A. Irvine
 */
public class A007592 implements Sequence {

  private long mN = 20;

  @Override
  public Z next() {
    while (true) {
      final long sigma = Cheetah.factor(++mN).sigma().longValueExact();
      final long s = sigma - mN - 1;
      if (s != 0 && s != mN - 1 && (mN - 1) % s == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
