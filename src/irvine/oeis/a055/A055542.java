package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a000.A000088;

/**
 * A055542 Total number of nodes in all simple graphs of n nodes.
 * @author Sean A. Irvine
 */
public class A055542 extends A000088 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().multiply(mN);
  }
}
