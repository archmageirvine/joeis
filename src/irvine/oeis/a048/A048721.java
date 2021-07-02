package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A048721 Binary packing of Fibonacci sequence A000045.
 * @author Sean A. Irvine
 */
public class A048721 extends A000045 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    final Z t = super.next();
    if (!t.isZero()) {
      mA = mA.add(Z.ONE.shiftLeft(t.intValueExact() - 1));
    } else {
      super.next(); // skip a 1
    }
    return mA;
  }
}
