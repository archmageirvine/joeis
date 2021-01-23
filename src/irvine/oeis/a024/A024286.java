package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009341;

/**
 * A024286 Expansion of e.g.f. log(1+sin(x)*x)/2 (even coefficients).
 * @author Sean A. Irvine
 */
public class A024286 extends A009341 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

