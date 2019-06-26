package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009591;

/**
 * A024232 Expansion of <code>sinh(sin(x))*sin(x)/2</code>.
 * @author Sean A. Irvine
 */
public class A024232 extends A009591 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

