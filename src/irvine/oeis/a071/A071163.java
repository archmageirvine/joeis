package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a057.A057120;

/**
 * A071163 A014486-indices for rooted binary trees with height equal to number of internal vertices. (Binary trees where at each internal vertex at least the other child is leaf.).
 * @author Sean A. Irvine
 */
public class A071163 extends A071162 {

  @Override
  public Z next() {
    return A057120.catalanGlobalRank(super.next());
  }
}
