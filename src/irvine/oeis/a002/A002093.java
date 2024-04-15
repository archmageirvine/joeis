package irvine.oeis.a002;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002093 Highly abundant numbers: numbers k such that sigma(k) &gt; sigma(m) for all m &lt; k.
 * @author Sean A. Irvine
 */
public class A002093 extends Sequence1 {

  private long mN = 0;
  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z sigma = Functions.SIGMA.z(++mN);
      if (sigma.compareTo(mPrev) > 0) {
        mPrev = sigma;
        return Z.valueOf(mN);
      }
    }
  }
}
