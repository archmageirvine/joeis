package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a057.A057120;

/**
 * A071153.
 * @author Sean A. Irvine
 */
public class A071163 extends A071162 {

  @Override
  public Z next() {
    return A057120.catalanGlobalRank(super.next());
  }
}
