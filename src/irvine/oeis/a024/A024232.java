package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009591;

/**
 * A024232 Expansion of sinh(sin(x))*sin(x)/2.
 * @author Sean A. Irvine
 */
public class A024232 extends A009591 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

