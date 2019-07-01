package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009837;

/**
 * A024342 E.g.f. <code>tanh(x)*tan(x)</code>, coefficients of powers <code>x^(4*n+2)</code>.
 * @author Sean A. Irvine
 */
public class A024342 extends A009837 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}

