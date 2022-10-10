package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a027.A027907;

/**
 * A059782 Triangle T(n,k) giving exponent of power of 3 dividing entry (n,k) of trinomial triangle A027907.
 * @author Sean A. Irvine
 */
public class A059782 extends A027907 {

  @Override
  public Z next() {
    Z t = super.next();
    long cnt = -1;
    Z[] qr;
    do {
      ++cnt;
      qr = t.divideAndRemainder(Z.THREE);
      t = qr[0];
    } while (qr[1].isZero());
    return Z.valueOf(cnt);
  }
}
