package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a000.A000669;

/**
 * A058757 <code>a(n) =</code> n*coefficient of <code>x^n</code> in log(1+S), S = g.f. for A000084.
 * @author Sean A. Irvine
 */
public class A058757 extends A000669 {

  @Override
  public Z next() {
    super.next();
    return mP.get(mN);
  }
}
