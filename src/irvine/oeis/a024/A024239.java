package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009815;

/**
 * A024239 Expansion of tanh(tan(x)*sin(x))/2.
 * @author Sean A. Irvine
 */
public class A024239 extends A009815 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

