package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034275 a(n)=f(n,n-2) where f is given in A034261.
 * @author Sean A. Irvine
 */
public class A034275 extends A034261 {

  private long mN = 0;

  @Override
  public Z next() {
    return f(++mN, mN - 2);
  }
}

