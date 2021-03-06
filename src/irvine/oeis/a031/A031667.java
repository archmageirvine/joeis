package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031667 Numbers k such that the continued fraction for sqrt(k) has odd period and central terms 79.
 * @author Sean A. Irvine
 */
public class A031667 extends A031414 {

  @Override
  protected Z target() {
    return Z.valueOf(79);
  }
}
