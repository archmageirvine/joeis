package irvine.oeis.a051;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051516 Number of triangles with perimeter n having integer sides and area.
 * @author Sean A. Irvine
 */
public class A051516 extends Sequence1 {

  // After Wesley Ivan Hurt

  protected long mN = 0;

  @Override
  public Z next() {
    if ((++mN & 1) == 1) {
      return Z.ZERO;
    }
    long sum = 0;
    for (long k = 1; k <= mN / 3; ++k) {
      for (long j = k; j <= (mN - k) / 2; ++j) {
        final CR n2 = CR.valueOf(mN).divide(CR.TWO);
        final long sign = new Q(j + k, mN - j - k + 1).floor().signum();
        if (sign != 0) {
          final CR m = n2.multiply(n2.subtract(CR.valueOf(j))).multiply(n2.subtract(CR.valueOf(k))).multiply(CR.valueOf(j + k).subtract(n2)).sqrt();
          sum += 1 - m.ceil().longValueExact() + m.floor().longValueExact();
        }
      }
    }
    return Z.valueOf(sum);
  }
}
