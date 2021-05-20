package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047763 A047762(2n+1).
 * @author Sean A. Irvine
 */
public class A047763 extends A047762 {

  @Override
  public Z next() {
    final Z res = super.next();
    super.next();
    return res;
  }
}
