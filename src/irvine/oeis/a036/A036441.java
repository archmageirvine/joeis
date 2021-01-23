package irvine.oeis.a036;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036441 a(n+1) = next number having largest prime dividing a(n) as a factor, with a(1) = 2.
 * @author Sean A. Irvine
 */
public class A036441 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
    } else {
     final Z[] p = Cheetah.factor(mA).toZArray();
     mA = mA.add(p[p.length - 1]);
    }
    return mA;
  }
}
