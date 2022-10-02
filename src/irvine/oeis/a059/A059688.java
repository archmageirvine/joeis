package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A059688 Length of Cunningham chain containing prime(n) either as initial, internal or final term.
 * @author Sean A. Irvine
 */
public class A059688 extends A000040 {

  @Override
  public Z next() {
    Z p = super.next();
    Z q;
    while ((q = p.subtract(1).divide2()).isProbablePrime()) {
      p = q;
    }
    long len = 0;
    do {
      ++len;
      p = p.multiply2().add(1);
    } while (p.isProbablePrime());
    return len == 1 ? Z.ZERO : Z.valueOf(len);
  }
}
