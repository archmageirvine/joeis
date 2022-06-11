package irvine.oeis.a057;

import irvine.math.z.Z;

/**
 * A057516 Number of sea-level valleys in Catalan mountain ranges encoded by A014486.
 * @author Sean A. Irvine
 */
public class A057516 extends A057515 {

  @Override
  public Z next() {
    return super.next().subtract(1).max(Z.ZERO);
  }
}
