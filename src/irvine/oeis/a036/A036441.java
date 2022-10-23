package irvine.oeis.a036;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036441 a(n+1) = next number having largest prime dividing a(n) as a factor, with a(1) = 2.
 * @author Sean A. Irvine
 */
public class A036441 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
    } else {
     final Z[] p = Jaguar.factor(mA).toZArray();
     mA = mA.add(p[p.length - 1]);
    }
    return mA;
  }
}
