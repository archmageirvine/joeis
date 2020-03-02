package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029587 <code>a(n) = A029571(n) / 6</code>.
 * @author Sean A. Irvine
 */
public class A029587 extends A029571 {

  @Override
  public Z next() {
    return super.next().divide(6);
  }
}
