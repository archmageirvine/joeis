package irvine.oeis.a068;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;

/**
 * A068723.
 * @author Sean A. Irvine
 */
public class A068742 extends A068741 {

  private int mN = -1;

  @Override
  public Z next() {
    Z t = super.next();
    if (++mN < 2) {
      return Z.ONE;
    }
    final Z f = MemoryFactorial.SINGLETON.factorial(mN);
    Z res = Z.ONE;
    while (true) {
      final Z[] qr = t.divideAndRemainder(f);
      if (!qr[1].isZero()) {
        return res;
      }
      res = res.multiply(f);
      t = qr[0];
    }
  }
}
