package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047882 a(n) = A047881(n) / 2.
 * @author Sean A. Irvine
 */
public class A047882 extends A047881 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
