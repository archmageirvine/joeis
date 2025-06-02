package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.a074.A074586;

/**
 * A077598 Coefficient of x^2 in the n-th Moebius polynomial (A074586), M(n,x), which satisfies M(n,-1)=mu(n) the Moebius function of n.
 * @author Sean A. Irvine
 */
public class A077598 extends A074586 {

  private int mN = 0;

  @Override
  public Z next() {
    return mB.get(++mN, 3);
  }
}
