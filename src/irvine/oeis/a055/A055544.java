package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a000.A000081;

/**
 * A055544 Total number of nodes in all rooted trees with n nodes.
 * @author Sean A. Irvine
 */
public class A055544 extends A000081 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().multiply(size() - 1);
  }
}
