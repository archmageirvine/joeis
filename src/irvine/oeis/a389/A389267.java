package irvine.oeis.a389;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A389267 a(1) = 2; thereafter a(n) = a(n-1) + b(a(n-1)), where b(k) is the second greatest distinct prime factor of k, or the greatest if there is only one distinct prime factor.
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
