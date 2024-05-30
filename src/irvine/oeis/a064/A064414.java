package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064414 Fix a &gt; 0, b &gt; 0, k &gt; 0 and define G_1 = a, G_2 = b, G_k = G_(k-1) + G_(k-2); sequence gives numbers m such that there exists (a, b) where G_k is divisible by m.
 * @author Sean A. Irvine
 */
public class A064414 extends Sequence1 {

  private long mN = 0;

  private boolean test(final long aStart, final long bStart) {
    Z a = Z.valueOf(aStart);
    Z b = Z.valueOf(bStart);
    long k = 0;
    while (++k <= 2 * mN) {
      final Z t = a.add(b);
      a = b;
      b = t;
      if (t.mod(mN) == 0) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      boolean ok = true;
      for (long a = 1; a <= Functions.SQRT.l(mN); ++a) {
        for (long b = 1; b <= Functions.SQRT.l(mN); ++b) {
          if (!test(a, b)) {
            ok = false;
            break;
          }
        }
      }
      if (ok) {
        return Z.valueOf(mN);
      }
    }
  }
}

