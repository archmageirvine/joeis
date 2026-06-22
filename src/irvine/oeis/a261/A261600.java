package irvine.oeis.a261;

import java.util.HashMap;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A261600 Number of primitive (aperiodic, or Lyndon) necklaces with n beads such that beads of a largest subset have label 0, beads of a largest remaining subset have label 1, and so on.
 * @author Sean A. Irvine
 */
public class A261600 extends Sequence0 {

  private long mN = -1;
  private final HashMap<String, Z> mCache = new HashMap<>();

  private Z b(final long n, final long i, final long g, final long d, final long j) {
    if (g > 0 && g < d) {
      return Z.ZERO;
    }
    if (n == 0) {
      return d == g ? Z.ONE : Z.ZERO;
    }
    if (i < 1) {
      return Z.ZERO;
    }
    final String key = n + "," + i + "," + g + "," + d + "," + j;
    final Z res = mCache.get(key);
    if (res != null) {
      return res;
    }
    final Z t = b(n, i - 1, g, d, j).add(i > n ? Z.ZERO : Binomial.binomial(n / j, i / j).multiply(b(n - i, i, Functions.GCD.l(i, g), d, j)));
    mCache.put(key, t);
    return t;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      final long dd = d.longValue();
      for (final Z j : Jaguar.factor(d).divisors()) {
        final long jj = j.longValue();
        final int m = Functions.MOBIUS.i(jj);
        if (m != 0) {
          sum = sum.signedAdd(m == 1, b(mN, mN, 0, dd, jj));
        }
      }
    }
    return sum.divide(mN);
  }
}
