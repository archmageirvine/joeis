package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a006.A006277;

/**
 * A007704 <code>a(n+2) = (a(n) - 1)a(n+1) + 1</code>.
 * @author Sean A. Irvine
 */
public class A007704 extends A006277 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
