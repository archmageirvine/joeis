package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027857 Number of positive divisors of n!, read mod n.
 * @author Sean A. Irvine
 */
public class A027857 extends A027423 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().mod(Z.valueOf(mN));
  }
}
