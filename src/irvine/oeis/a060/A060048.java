package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A060048 a(1) = 1 and for n&gt;1 a(n) = Max { q prime | q# &lt; prime(n)# / q# } where prime(i) = A000040(i) and p(i)# = A002110(i), primorial.
 * @author Sean A. Irvine
 */
public class A060048 extends A002110 {

  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    Z prim = super.next();
    long q = 1;
    Z qp = Z.ONE;
    while (qp.compareTo(prim) < 0) {
      q = mPrime.nextPrime(q);
      qp = qp.multiply(q);
      prim = prim.divide(q);
    }
    return Z.valueOf(mPrime.prevPrime(q)).max(Z.ONE);
  }
}
