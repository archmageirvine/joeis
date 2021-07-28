package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049316 The number k(GL(n,q)) of conjugacy classes in GL(n,q), q=7.
 * @author Sean A. Irvine
 */
public class A049316 extends A049314 {

  @Override
  protected Z q() {
    return Z.SEVEN;
  }
}
