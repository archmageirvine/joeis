package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034273 a(n) = binomial(2*n+6,n+7)*(n^2+7*n+1)/(n+8) = f(n,n+6) where f is given in A034261.
 * @author Sean A. Irvine
 */
public class A034273 extends A034261 {

  private long mN = -1;

  @Override
  public Z next() {
    return f(++mN, mN + 6);
  }
}

