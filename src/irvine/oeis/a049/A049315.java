package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049315 The number k(GL(n,q)) of conjugacy classes in GL(n,q), q=5.
 * @author Sean A. Irvine
 */
public class A049315 extends A049314 {

  @Override
  protected Z q() {
    return Z.FIVE;
  }
}
