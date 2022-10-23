package irvine.oeis.a029;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A029827 Composite connected numbers: composite numbers k such that g(k) &lt; g(u) + g(v) holds for all relatively prime factorizations k=u*v, where g(x) = ceiling(log_2 x).
 * @author Sean A. Irvine
 */
public class A029827 extends Sequence1 {

  // After Michel Marcus

  private long mN = 13;

  private long g(final long n) {
    return 1 + LongUtils.lg(n);
  }

  private boolean isOk(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    if (fs.omega() <= 1) {
      return false; // Prime
    }
    final long gn = g(n);
    boolean bpf = false;
    for (final Z dd : fs.divisors()) {
      final long d = dd.longValue();
      if (d != 1 && d != n && LongUtils.gcd(d, n / d) == 1) {
        bpf = true;
        if (gn >= g(d) + g(n / d)) {
          return false;
        }
      }
    }
    return bpf;
  }

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (isOk(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
