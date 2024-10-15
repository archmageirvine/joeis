package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.InverseSigma;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072612 Minimal value of { abs(n-sigma(k)) : k&gt;0 }.
 * @author Sean A. Irvine
 */
public class A072612 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (!InverseSigma.countInverseSigma(Z.valueOf(++mN)).isZero()) {
      return Z.ZERO;
    }
    long min = mN;
    for (long k = 1; k <= mN && min != 1; ++k) {
      final long t = Math.abs(mN - Functions.SIGMA1.l(k));
      if (t < min) {
        min = t;
      }
    }
    return Z.valueOf(min);
  }
}
