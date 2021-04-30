package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A033187 a(n) = (n!)!/n!.
 * @author Sean A. Irvine
 */
public class A033187 extends A000142 {

  @Override
  public Z next() {
    final Z n = super.next();
    Z f = Z.ONE;
    for (Z k = Z.TWO; k.compareTo(n) < 0; k = k.add(1)) {
      f = f.multiply(k);
    }
    return f;
  }
}
