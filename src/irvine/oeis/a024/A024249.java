package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009812;

/**
 * A024249 Expansion of tanh(tan(x))*tan(x)/2.
 * @author Sean A. Irvine
 */
public class A024249 extends A009812 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

