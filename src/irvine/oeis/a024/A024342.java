package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009837;

/**
 * A024342 Expansion of e.g.f. tanh(x)*tan(x), coefficients of powers x^(4*n+2).
 * @author Sean A. Irvine
 */
public class A024342 extends A009837 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}

