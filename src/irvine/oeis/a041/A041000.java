package irvine.oeis.a041;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A041000.
 * @author Sean A. Irvine
 */
public class A041000 extends A000040 {

  @Override
  public Z next() {
    final Z t = ZUtils.sortDigitsAscending(super.next());
    Z[] qr =t.divideAndRemainder(Z.TEN);
    long s = qr[1].longValue();
    while (!qr[0].isZero()) {
      qr = qr[0].divideAndRemainder(Z.TEN);
      s -= qr[1].longValue();
    }
    return Z.valueOf(Math.abs(s));
  }
}
