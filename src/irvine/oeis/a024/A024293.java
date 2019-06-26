package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009344;

/**
 * A024293 Expansion of e.g.f. <code>log(1+sin(x)^2)/2 (even-indexed</code> coefficients).
 * @author Sean A. Irvine
 */
public class A024293 extends A009344 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

