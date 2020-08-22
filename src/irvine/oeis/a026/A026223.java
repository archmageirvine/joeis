package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026223 (1/3)*s(n+1), where s = A026222.
 * @author Sean A. Irvine
 */
public class A026223 extends A026222 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(3);
  }
}
