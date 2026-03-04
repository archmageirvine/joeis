package irvine.oeis.a390;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390836 allocated for Claude H. R. Dequatre.
 * @author Sean A. Irvine
 */
public class A390836 extends Sequence1 {

  private Z mF = Z.ONE;
  private long mN = 1;

  protected Z select(final Q n) {
    return n.num();
  }

  private long modF(final long n, final long s) {
    long f = 1;
    for (long k = 2; k <= n; ++k) {
      f *= k;
      f %= s;
      if (f == 0) {
        return 0;
      }
    }
    return f;
  }

  @Override
  public Z next() {
    while (true) {
      mF = mF.multiply(++mN);
      final Z s = Functions.SIGMA1.z(mN);
      if (modF(mN, s.longValueExact()) != 0) {
        return select(new Q(mF, s));
      }
    }
  }
}
