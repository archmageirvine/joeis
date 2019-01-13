package irvine.oeis.a100;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.math.factorial.MemoryFactorial;
import irvine.oeis.Sequence;

/**
 * A100640.
 * @author Sean A. Irvine
 */
public class A100640 implements Sequence {

  private static final MemoryFactorial F = new MemoryFactorial();

  /**
   * Cotesian numbers.
   * @param n upper index
   * @param k lower index
   * @return cotesian number
   */
  public static Q cotesian(final int n, final int k) {
    if (k == 0 || k == n) {
      Q s = Q.ZERO;
      Z m = Z.ONE;
      for (int a = 1; a <= n + 1; ++a) {
        m = m.multiply(n);
        s = s.add(new Q(Stirling.firstKind(n, a).multiply(m), Z.valueOf(a + 1)));
      }
      return s.divide(F.factorial(n));
    } else {
      Q s = Q.ZERO;
      Z m = Z.ONE;
      for (int a = 1; a <= k + 1; ++a) {
        Q u = Q.ZERO;
        m = m.multiply(n);
        Z v = m;
        for (int b = 1; b <= n - k + 1; ++b) {
          v = v.multiply(n);
          final Q t = new Q(Stirling.firstKind(k, a).multiply(Stirling.firstKind(n - k, b)).multiply(v), Binomial.binomial(a + b + 1, b + 1).multiply(b + 1));
          u = u.add(t);
        }
        s = s.add(u);
      }
      return s.multiply(Binomial.binomial(n, k)).divide(F.factorial(n));
    }
  }

  private int mN = -1;
  private int mK = 0;

  @Override
  public Z next() {
    if (mK >= mN) {
      ++mN;
      mK = -1;
    }
    return cotesian(mN, ++mK).num();
  }
}
