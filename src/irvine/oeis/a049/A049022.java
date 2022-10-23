package irvine.oeis.a049;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A049022 Recurring combinations: a(n) = C(a(n-1),a(n-2)).
 * @author Sean A. Irvine
 */
public class A049022 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.TWO;
        return Z.TWO;
      }
      mB = Z.FOUR;
      return Z.FOUR;
    }
    final Z t = Binomial.binomial(mB, mA);
    mA = mB;
    mB = t;
    return t;
  }
}

