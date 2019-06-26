package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009606;

/**
 * A024259 Expansion of <code>sinh(tan(x))*sin(x)/2</code>.
 * @author Sean A. Irvine
 */
public class A024259 extends A009606 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

