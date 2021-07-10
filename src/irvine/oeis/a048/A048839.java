package irvine.oeis.a048;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048839 Numbers n dividing P(n)!, where P(n) is the largest prime factor of n.
 * @author Sean A. Irvine
 */
public class A048839 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z[] p = Cheetah.factor(++mN).toZArray();
      final long m = p[p.length - 1].longValue();
      if (m == mN) {
        return Z.valueOf(mN); // must have been prime
      }
      for (long f = 1, k = 2; k <= m; ++k) {
        f *= k;
        f %= mN;
        if (f == 0) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
