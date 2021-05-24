package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047882 a(n)=(1/2)*b(n), where b=A049648.
 * @author Sean A. Irvine
 */
public class A047882 extends A047881 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
