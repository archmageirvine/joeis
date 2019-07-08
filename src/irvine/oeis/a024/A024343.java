package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009564;

/**
 * A024343 Expansion of e.g.f. <code>sin(x^2)</code>, coefficients of <code>x^(4*n + 2)</code>.
 * @author Sean A. Irvine
 */
public class A024343 extends A009564 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}

