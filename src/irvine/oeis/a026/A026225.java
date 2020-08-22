package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026225 a(n) = (1/3)*(s(n+1) - 1), where s = A026224.
 * @author Sean A. Irvine
 */
public class A026225 extends A026224 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(3);
  }
}
