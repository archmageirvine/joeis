package irvine.oeis.a074;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A074587 Sum of the coefficients of the n-th Moebius polynomial, M(n,x), where M(n,-1) = mu(n), the Moebius function of n.
 * @author Sean A. Irvine
 */
public class A074587 extends A074586 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(1, ++mN, k -> mB.get(mN, k));
  }
}
