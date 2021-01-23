package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A006508 a(n+1) = a(n)-th composite number, with a(0) = 1.
 * @author Sean A. Irvine
 */
public class A006508 extends A002808 {

  private Z mA = null;
  private Z mCompositeCount = Z.ZERO;

  private Z findComposite() {
    Z t;
    do {
      t = super.next();
      mCompositeCount = mCompositeCount.add(1);
    } while (mCompositeCount.compareTo(mA) < 0);
    return t;
  }

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : findComposite();
    return mA;
  }

}
