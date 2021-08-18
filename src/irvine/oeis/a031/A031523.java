package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031523 that the continued fraction for sqrt(k) has even period and if the last term of the periodic part is deleted the central term is 25.
 * @author Sean A. Irvine
 */
public class A031523 extends A031404 {

  @Override
  protected Z target() {
    return Z.valueOf(25);
  }
}
