package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.a002.A002251;

/**
 * A026247 a(n) = (1/2)*s(n), where s(n) is n-th even number in A002251.
 * @author Sean A. Irvine
 */
public class A026247 extends A002251 {

  {
    super.next();
  }

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.isOdd());
    return t.divide2();
  }
}
