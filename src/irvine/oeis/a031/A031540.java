package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031540 Numbers n such that continued fraction for sqrt(n) has even period and central term 42.
 * @author Sean A. Irvine
 */
public class A031540 extends A031404 {

  @Override
  protected Z target() {
    return Z.valueOf(42);
  }
}
