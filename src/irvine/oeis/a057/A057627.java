package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a013.A013928;

/**
 * A057627 Number of nonsquarefree numbers not exceeding n.
 * @author Sean A. Irvine
 */
public class A057627 extends A013928 {

  private long mN = 0;
  {
    super.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(++mN).subtract(super.next());
  }
}
