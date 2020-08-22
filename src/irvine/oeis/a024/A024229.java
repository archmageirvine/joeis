package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009834;

/**
 * A024229 Expansion of tanh(x)*sin(tan(x))/2.
 * @author Sean A. Irvine
 */
public class A024229 extends A009834 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

