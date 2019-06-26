package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009484;

/**
 * A024237 Expansion of <code>sin(sin(x)*x)/2</code>.
 * @author Sean A. Irvine
 */
public class A024237 extends A009484 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

