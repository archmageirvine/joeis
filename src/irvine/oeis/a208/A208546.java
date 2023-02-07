package irvine.oeis.a208;
// manually etman at 2023-02-06 12:43

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A208546 Expansion of f(-x^29, x^31) + x * f(-x^19, x^41) - x^3 * f(-x^11, x^49) + x^7 * f(x, -x^59) in powers of x where f() is Ramanujan's two-variable theta function.
 * <code>(PARI) {a(n) = local(m); if( issquare( 120*n + 1, &m), (-1)^(m \ 40 + m \ 12))}</code>
 * @author Georg Fischer
 */
public class A208546 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    final long n121 = 120 * mN + 1;
    final long m = LongUtils.sqrt(n121);
    if (m * m == n121) {
      return (((m / 40 + m / 12) & 1) == 0) ? Z.ONE : Z.NEG_ONE;
    } else {
      return Z.ZERO;
    }
  }
}
