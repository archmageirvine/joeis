package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395251 a(n) gives positions k &gt;= 1 where the equation b(b(k)+b(k-1)) = k fails, for b(k) = floor(k/sqrt(2) + 2*(sqrt(2)-1)).
 * @author Sean A. Irvine
 */
public class A395251 extends Sequence1 {

  private static final CR C = CR.SQRT2.subtract(1).multiply(2);
  private Z mN = Z.ZERO;

  private Z b(final Z k) {
    return CR.valueOf(k).divide(CR.SQRT2).add(C).floor();
  }

  @Override
  public Z next() {
    while (true) {
      final Z m = mN;
      mN = mN.add(1);
      if (!b(b(mN).add(b(m))).equals(mN)) {
        return mN;
      }
    }
  }
}
