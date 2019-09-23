package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.a002.A002251;

/**
 * A026245 <code>a(n) = (1/2)*(s(n) + 1)</code>, where <code>s(n)</code> is the n-th odd number in <code>A002251</code>.
 * @author Sean A. Irvine
 */
public class A026245 extends A002251 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.isEven());
    return t.add(1).divide2();
  }
}
