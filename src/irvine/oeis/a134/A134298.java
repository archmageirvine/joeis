package irvine.oeis.a134;

import irvine.math.z.Z;

/**
 * A134298 a(n) = (107*n)^5.
 * @author Sean A. Irvine
 */
public class A134298 extends A134297 {

  @Override
  public Z next() {
    return super.next().pow(5);
  }
}
