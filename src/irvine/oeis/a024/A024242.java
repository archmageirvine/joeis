package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009796;

/**
 * A024242 Expansion of <code>tanh(sin(x))*tan(x)/2</code>.
 * @author Sean A. Irvine
 */
public class A024242 extends A009796 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

