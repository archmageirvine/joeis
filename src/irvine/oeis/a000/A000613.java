package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000613 Number of Boolean functions of n variables.
 * @author Sean A. Irvine
 */
public class A000613 extends A000585 {

  @Override
  public Z next() {
    return super.next().divide(2);
  }
}
