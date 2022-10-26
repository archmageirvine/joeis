package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a003.A003714;

/**
 * A060112 Sums of nonconsecutive factorial numbers.
 * @author Sean A. Irvine
 */
public class A060112 extends A003714 {

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    Z t = super.next();
    Z f = Z.ONE;
    Z s = Z.ZERO;
    long k = 0;
    while (!t.isZero()) {
      f = f.multiply(++k);
      if (t.isOdd()) {
        s = s.add(f);
      }
      t = t.divide2();
    }
    return s;
  }
}
