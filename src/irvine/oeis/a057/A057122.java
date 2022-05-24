package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A057122 The binary encoding (as a rooted planar tree) of each rooted planar binary tree. See A057123 for illustration.
 * @author Sean A. Irvine
 */
public class A057122 extends A014486 {

  @Override
  public Z next() {
    return A057119.bintreeDepthFirst2Tree(super.next());
  }
}
