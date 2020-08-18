package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034269 <code>a(n) = f(n,n+2)</code> where f is given in <code>A034261</code>.
 * @author Sean A. Irvine
 */
public class A034269 extends A034261 {

  private long mN = -1;

  @Override
  public Z next() {
    return f(++mN, mN + 2);
  }
}

