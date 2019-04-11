package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a007.A007727;

/**
 * A022553 Number of binary Lyndon words containing n letters of each type; periodic binary sequences of period <code>2n</code> with n zeros and n ones in each period.
 * @author Sean A. Irvine
 */
public class A022553 extends A007727 {

  @Override
  public Z next() {
    final Z t = super.next();
    return mN > 0 ? t.divide2().divide(mN) : t;
  }
}
