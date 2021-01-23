package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031688 Numbers n such that continued fraction for sqrt(n) has odd period and central term 100.
 * @author Sean A. Irvine
 */
public class A031688 extends A031414 {

  @Override
  protected Z target() {
    return Z.valueOf(100);
  }
}
