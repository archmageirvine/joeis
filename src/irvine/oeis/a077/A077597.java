package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.a074.A074586;

/**
 * A077597 Coefficient of x in the n-th Moebius polynomial (A074586), M(n,x), which satisfies M(n,-1)=mu(n) the Moebius function of n.
 * @author Sean A. Irvine
 */
public class A077597 extends A074586 {

  private int mN = 0;

  @Override
  public Z next() {
    return mB.get(++mN, 2);
  }
}
