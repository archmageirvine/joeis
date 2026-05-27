package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394678 allocated for C. Owen Prestwood.
 * @author Sean A. Irvine
 */
public class A394678 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long m = ++mN * mN;
    long r = 1;
    for (long k = 2; k <= mN; ++k) {
      r *= k;
      r %= m;
    }
    r += m - 1;
    return Z.valueOf(r % m);
  }
}
