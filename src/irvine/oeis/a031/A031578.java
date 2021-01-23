package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031578 Numbers n such that continued fraction for sqrt(n) has even period and central term 80.
 * @author Sean A. Irvine
 */
public class A031578 extends A031404 {

  @Override
  protected Z target() {
    return Z.valueOf(80);
  }
}
