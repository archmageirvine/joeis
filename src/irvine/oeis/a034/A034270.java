package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034270 <code>f(n,n+3)</code> where f is given in <code>A034261</code>.
 * @author Sean A. Irvine
 */
public class A034270 extends A034261 {

  private long mN = -1;

  @Override
  public Z next() {
    return f(++mN, mN + 3);
  }
}

