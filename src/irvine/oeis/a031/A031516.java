package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031516 that the continued fraction for sqrt(k) has even period and if the last term of the periodic part is deleted the central term is 18.
 * @author Sean A. Irvine
 */
public class A031516 extends A031404 {

  @Override
  protected Z target() {
    return Z.valueOf(18);
  }
}
