package irvine.oeis.a002;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002093 Highly abundant numbers: numbers k such that sigma(k) &gt; sigma(m) for all m &lt; k.
 * @author Sean A. Irvine
 */
public class A002093 implements Sequence {

  private long mN = 0;
  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z sigma = Jaguar.factor(++mN).sigma();
      if (sigma.compareTo(mPrev) > 0) {
        mPrev = sigma;
        return Z.valueOf(mN);
      }
    }
  }
}
