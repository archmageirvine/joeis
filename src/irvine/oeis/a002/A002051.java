package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a000.A000670;

/**
 * A002051.
 * @author Sean A. Irvine
 */
public class A002051 extends A000670 {

  private Z mT = Z.ONE;

  @Override
  public Z next() {
    final Z t = super.next();
    if (!Z.ONE.equals(t)) {
      mT = mT.multiply2();
    }
    return t.subtract(mT);
  }
}
