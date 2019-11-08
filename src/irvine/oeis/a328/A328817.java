package irvine.oeis.a328;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A328817 allocated for Awani Kumar.
 * @author Sean A. Irvine
 */
public class A328817 implements Sequence {

  private long mN = 1;

  private boolean isSquareLeastPrimeFactor(final long n) {
    final FactorSequence fs = Cheetah.factor(n);
    return fs.getExponent(fs.toZArray()[0]) > 1;
  }

  private boolean isSquareLeastPrimeFactor(final long n, final long steps, final int minCount) {
    int c = 0;
    for (long k = n; k < n + steps; ++k) {
      if (isSquareLeastPrimeFactor(k) && ++c == minCount) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (isSquareLeastPrimeFactor(++mN, 10, 7)) {
        return Z.valueOf(mN);
      }
    }
  }
}
