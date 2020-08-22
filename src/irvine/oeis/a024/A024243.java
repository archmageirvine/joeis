package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009800;

/**
 * A024243 Expansion of tanh(sin(x)*x)/2.
 * @author Sean A. Irvine
 */
public class A024243 extends A009800 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

