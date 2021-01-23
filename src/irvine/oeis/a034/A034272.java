package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034272 a(n)=f(n,n+5) where f is given in A034261.
 * @author Sean A. Irvine
 */
public class A034272 extends A034261 {

  private long mN = -1;

  @Override
  public Z next() {
    return f(++mN, mN + 5);
  }
}

