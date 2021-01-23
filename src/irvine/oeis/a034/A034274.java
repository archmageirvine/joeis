package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034274 a(n)=f(n,n-1) where f is given in A034261.
 * @author Sean A. Irvine
 */
public class A034274 extends A034261 {

  private long mN = 1;

  @Override
  public Z next() {
    return f(++mN, mN - 1);
  }
}

