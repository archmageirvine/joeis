package irvine.oeis.a057;

import irvine.math.z.Z;

/**
 * A057518 The global ranks of each term of A057517, i.e., tells that A057515(A057518(n)) = 2 for all n.
 * @author Sean A. Irvine
 */
public class A057518 extends A057517 {

  @Override
  public Z next() {
    return A057120.catalanGlobalRank(super.next());
  }
}
