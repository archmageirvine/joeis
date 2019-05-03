package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a000.A000669;

/**
 * A058757 <code>a(n) = n*coefficient</code> of <code>x^n</code> in <code>log(1+S), S =</code> g.f. for <code>A000084</code>.
 * @author Sean A. Irvine
 */
public class A058757 extends A000669 {

  @Override
  public Z next() {
    super.next();
    return mP.get(mN);
  }
}
