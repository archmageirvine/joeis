package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031652 Numbers n such that continued fraction for sqrt(n) has odd period and central terms 64.
 * @author Sean A. Irvine
 */
public class A031652 extends A031414 {

  @Override
  protected Z target() {
    return Z.valueOf(64);
  }
}
