package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a070.A070911;

/**
 * A063984 Minimal number of integer points in the Euclidean plane which are contained in the interior of any convex n-gon whose vertices have integer coordinates.
 * @author Sean A. Irvine
 */
public class A063984 extends A070911 {

  @Override
  public Z next() {
    return super.next().subtract(mN).divide2().add(1);
  }
}
