package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a000.A000055;

/**
 * A055543 Total number of nodes in all trees with n nodes.
 * @author Sean A. Irvine
 */
public class A055543 extends A000055 {

  private long mN = 0;

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().multiply(++mN);
  }
}
