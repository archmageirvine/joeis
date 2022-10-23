package irvine.oeis.a027;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A027564 Numbers not of form abcd + abce + abde + acde + bcde for 1 &lt;= a &lt;= b &lt;= c &lt;= d &lt;= e.
 * @author Sean A. Irvine
 */
public class A027564 extends Sequence1 {

  // After Robert Israel

  private long mN = 0;

  private boolean is(final long n) {
    // Following limit is probably overkill on precision
    final long limit = CR.valueOf(new Q(n, 5)).sqrt().sqrt().floor().longValueExact();
    for (long a = 1; a <= limit; ++a) {
      for (long b = a; 4 * a * b * b * b + b * b * b * b <= n; ++b) {
        for (long c = b; 3 * a * b * c * c + (a + b) * c * c * c <= n; ++c) {
          for (long d = c; 2 * a * b * c * d + (b * c + a * c + a * b) * d * d <= n; ++d) {
            for (long e = d; ; ++e) {
              final long r = a * b * c * d + a * b * c * e + a * b * d * e + a * c * d * e + b * c * d * e;
              if (r == n) {
                return true;
              } else if (r > n) {
                break;
              }
            }
          }
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (is(++mN)) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
