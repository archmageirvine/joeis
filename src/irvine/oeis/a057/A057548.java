package irvine.oeis.a057;

import irvine.math.z.Z;

/**
 * A057548 A014486-indices of Catalan mountain ranges with no sea-level valleys, i.e., the rooted plane general trees with root degree = 1.
 * @author Sean A. Irvine
 */
public class A057548 extends A057547 {

  @Override
  public Z next() {
    return A057120.catalanGlobalRank(super.next());
  }
}
