package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A051954 a(n) = smallest palindrome &gt; a(n-1) such that a(1)*a(2)*...*a(n) - 1 is a prime.
 * @author Sean A. Irvine
 */
public class A051954 extends A002113 {

  {
    super.next();
    super.next();
    super.next();
  }
  private Z mProd = super.next(); // 3
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = mProd;
    } else {
      while (true) {
        final Z palin = super.next();
        final Z prod = mProd.multiply(palin);
        if (prod.subtract(1).isProbablePrime()) {
          mProd = prod;
          mA = palin;
          break;
        }
      }
    }
    return mA;
  }
}
