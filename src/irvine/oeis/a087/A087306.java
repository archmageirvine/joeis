package irvine.oeis.a087;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A087306 a(n) is the start of the first arithmetic progression with common difference n of n numbers with the same prime signature.
 * @author Sean A. Irvine
 */
public class A087306 extends Sequence2 {

  private long mN = 0;

  private boolean is(long s, final long n) {
    final Z sig = FactorUtils.leastPrimeSignature(s);
    for (long k = 1; k < n; ++k) {
      s += n;
      if (!FactorUtils.leastPrimeSignature(s).equals(sig)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    long s = 0;
    while (!is(++s, mN)) {
      // do nothing
    }
    return Z.valueOf(s);
  }
}
