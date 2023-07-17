package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025135 (n-1)st elementary symmetric function of binomial(n,0), binomial(n,1), ..., binomial(n,n).
 * @author Sean A. Irvine
 */
public class A025135 extends A025134 {

  /** Construct the sequence. */
  public A025135() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return sym(Z.ONE, 0, ++mN, mN, mN - 1);
  }
}
