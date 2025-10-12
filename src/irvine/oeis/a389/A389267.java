package irvine.oeis.a389;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A389267 allocated for Xander Lee Luo.
 * @author Sean A. Irvine
 */
public class A389267 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
    } else {
      final Z[] p = Jaguar.factor(mA).toZArray();
      mA = mA.add(p.length > 1 ? p[p.length - 2] : p[p.length - 1]);
    }
    return mA;
  }
}
