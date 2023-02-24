package irvine.oeis.a119;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A119771 Product of n^2 and n-th tetrahedral number: a(n) = n^3*(n+1)*(n+2)/6.
 * @author Georg Fischer
 */
public class A119771 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN + 1).multiply((long) mN * mN).multiply(mN).multiply(mN + 2).divide(6);
  }
}
