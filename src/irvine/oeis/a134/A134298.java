package irvine.oeis.a134;

import irvine.math.z.Z;

/**
 * A134298 <code>a(n) = (107n)^5</code>.
 * @author Sean A. Irvine
 */
public class A134298 extends A134297 {

  @Override
  public Z next() {
    return super.next().pow(5);
  }
}
