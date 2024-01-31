package irvine.oeis.a068;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A068113 Numerator of coefficient of (-x^2)^n in F(x)*F(-x) where F(x)=sum(k&gt;=0,x^k/(k!)^3).
 * @author Sean A. Irvine
 */
public class A068113 extends A068112 {

  @Override
  protected Z select(final Q n) {
    return n.num();
  }
}
