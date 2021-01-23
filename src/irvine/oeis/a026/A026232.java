package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026232 a(n) = (1/3)*(s(n) + 1), where s = A026231.
 * @author Sean A. Irvine
 */
public class A026232 extends A026231 {

  @Override
  public Z next() {
    return super.next().add(1).divide(3);
  }
}
