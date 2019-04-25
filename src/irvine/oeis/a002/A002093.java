package irvine.oeis.a002;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002093 Highly abundant numbers: numbers n such that <code>sigma(n) &gt;</code> sigma(m) for all m <code>&lt; n</code>.
 * @author Sean A. Irvine
 */
public class A002093 implements Sequence {

  private long mN = 0;
  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z sigma = Cheetah.factor(++mN).sigma();
      if (sigma.compareTo(mPrev) > 0) {
        mPrev = sigma;
        return Z.valueOf(mN);
      }
    }
  }
}
