package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047880 a(n)=(1/2)*b(n), where b=A049690.
 * @author Sean A. Irvine
 */
public class A047880 extends A047879 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
