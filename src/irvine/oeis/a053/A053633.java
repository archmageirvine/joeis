package irvine.oeis.a053;

import irvine.math.IntegerUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A053633 Triangular array T(n,k) giving coefficients in expansion of Product_{j=1..n} (1+x^j) mod x^(n+1)-1.
 * @author Sean A. Irvine
 */
public class A053633 extends Sequence0 {

  private int mN = 1;
  private int mM = -1;

  private Z t(final int n, final int k) {
    Z t = Z.ZERO;
    for (int d = 1; d <= n; d += 2) {
      if (n % d == 0) {
        final int g = IntegerUtils.gcd(d, k);
        final int mu = Functions.MOBIUS.i((long) (d / g));
        if (mu != 0) {
          final long t1 = mu * Functions.PHI.l((long) d) / Functions.PHI.l((long) (d / g));
          t = t.add(Z.valueOf(t1).shiftLeft(n / d));
        }
      }
    }
    return t.divide(2L * n);
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
