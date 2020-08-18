package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034267 <code>a(n)=f(n,n)</code> where f is given in <code>A034261</code>.
 * @author Sean A. Irvine
 */
public class A034267 extends A034261 {

  private long mN = -1;

  @Override
  public Z next() {
    return f(++mN, mN);
  }
}

