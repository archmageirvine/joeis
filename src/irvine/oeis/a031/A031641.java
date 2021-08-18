package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031641 Numbers k such that the continued fraction for sqrt(k) has odd period and if the last term of the periodic part is deleted the two central terms are both 53.
 * @author Sean A. Irvine
 */
public class A031641 extends A031414 {

  @Override
  protected Z target() {
    return Z.valueOf(53);
  }
}
