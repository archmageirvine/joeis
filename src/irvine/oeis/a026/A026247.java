package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.a002.A002251;

/**
 * A026247 <code>a(n) = (1/2)*s(n)</code>, where <code>s(n)</code> is n-th even number in <code>A002251</code>.
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
    } while (!t.isEven());
    return t.divide2();
  }
}
