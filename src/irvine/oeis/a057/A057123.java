package irvine.oeis.a057;

import irvine.math.z.Z;

/**
 * A057123 Global ranks of terms of A057122: tells which terms of A014486 form rooted plane binary trees also when interpreted as codes for ordinary rooted planar trees.
 * @author Sean A. Irvine
 */
public class A057123 extends A057122 {

  @Override
  public Z next() {
    return A057120.catalanGlobalRank(super.next());
  }
}
