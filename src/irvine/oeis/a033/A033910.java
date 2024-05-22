package irvine.oeis.a033;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033910 Numbers k such that s(k) + s(k+1) + s(k+2) = t(k) + t(k+1) + t(k+2) where s(k) = sigma(k) - k, t(k) = |s(k) - k|.
 * @author Sean A. Irvine
 */
public class A033910 extends Sequence1 {

  private long mN = 0;

  private Z s(final long n) {
    return Functions.SIGMA1.z(n).subtract(n);
  }

  protected long m() {
    return 2;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      Z s = Z.ZERO;
      Z t = Z.ZERO;
      for (int k = 0; k <= m(); ++k) {
        final Z sk = s(mN + k);
        s = s.add(sk);
        t = t.add(sk.subtract(mN + k).abs());
      }
      if (s.equals(t)) {
        return Z.valueOf(mN);
      }
    }
  }
}
