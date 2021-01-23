package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031600 Numbers k such that the continued fraction for sqrt(k) has odd period and central terms 12.
 * @author Sean A. Irvine
 */
public class A031600 extends A031414 {

  @Override
  protected Z target() {
    return Z.valueOf(12);
  }
}
