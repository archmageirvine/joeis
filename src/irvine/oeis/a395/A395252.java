package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395252 a(n) gives positions k &gt;= 1 where the equation b(b(k)+b(k-1)+b(k-2)) = k fails, for b(k) = floor(k/sqrt(3) + (5*sqrt(3)-3)/6).
 * @author Sean A. Irvine
 */
public class A395252 extends Sequence1 {

  private static final CR SQRT3 = CR.THREE.sqrt();
  private static final CR C = SQRT3.multiply(5).subtract(3).divide(6);
  private Z mN = Z.ONE;

  private Z b(final Z k) {
    return CR.valueOf(k).divide(SQRT3).add(C).floor();
  }

  @Override
  public Z next() {
    while (true) {
      final Z m = mN;
      mN = mN.add(1);
      if (!b(b(mN).add(b(m).add(b(mN.subtract(2))))).equals(mN)) {
        return mN;
      }
    }
  }
}
