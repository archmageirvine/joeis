package irvine.oeis.a391;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A333024.
 * @author Sean A. Irvine
 */
public class A391768 extends Sequence1 {

  private long mN = 2;
  private CR mRecord =CR.ONE;

  @Override
  public Z next() {
    while (true) {
      final CR z = CR.valueOf(++mN);
      final CR v = z.lnGamma().divide(z.log());
      final CR d = v.subtract(v.round()).abs();
      if (d.compareTo(mRecord) < 0) {
        mRecord = d;
        return Z.valueOf(mN);
      }
    }
  }
}
