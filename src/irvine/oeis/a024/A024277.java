package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009398;

/**
 * A024277 E.g.f.: <code>log(1+tanh(x)*tan(x))/2</code> (even powers only).
 * @author Sean A. Irvine
 */
public class A024277 extends A009398 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

