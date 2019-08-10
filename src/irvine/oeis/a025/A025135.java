package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025135 <code>(n-1)st</code> elementary symmetric function of <code>binomial(n,0), binomial(n,1)</code>, ..., <code>binomial(n,n)</code>.
 * @author Sean A. Irvine
 */
public class A025135 extends A025134 {

  private long mN = 0;

  @Override
  public Z next() {
    return sym(Z.ONE, 0, ++mN, mN, mN - 1);
  }
}
