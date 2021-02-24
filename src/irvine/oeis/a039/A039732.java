package irvine.oeis.a039;

import irvine.math.z.Z;

/**
 * A039732 a(n)=(1/2)*s(n+1), s=A039731.
 * @author Sean A. Irvine
 */
public class A039732 extends A039731 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
