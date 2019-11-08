package irvine.oeis.a027;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027564 Numbers not of form abcd + abce + abde + acde + bcde for <code>1 &lt;= a &lt;= b &lt;= c &lt;= d &lt;=</code> e.
 * @author Sean A. Irvine
 */
public class A027564 implements Sequence {

  // After Robert Israel

  private long mN = 0;

  private boolean is(final long mN) {
    // Following limit is probably overkill on precision
    final long limit = CR.valueOf(new Q(mN, 5)).sqrt().sqrt().floor().longValueExact();
    for (long a = 1; a <= limit; ++a) {
      for (long b = a; 4 * a * b * b * b + b * b * b * b <= mN; ++b) {
        for (long c = b; 3 * a * b * c * c + (a + b) * c * c * c <= mN; ++c) {
          for (long d = c; 2 * a * b * c * d + (b * c + a * c + a * b) * d * d <= mN; ++d) {
            for (long e = d; ; ++e) {
              final long r = a * b * c * d + a * b * c * e + a * b * d * e + a * c * d * e + b * c * d * e;
              if (r == mN) {
                return true;
              } else if (r > mN) {
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
