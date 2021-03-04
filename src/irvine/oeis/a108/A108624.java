package irvine.oeis.a108;

import irvine.math.z.Z;
import irvine.oeis.a202.A202327;

/**
 * A108624 G.f. satisfies x = (A(x)+(A(x))^2)/(1-A(x)-(A(x))^2).
 * @author Sean A. Irvine
 */
public class A108624 extends A202327 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      sum = sum.add(super.next());
    }
    return sum;
  }
}

