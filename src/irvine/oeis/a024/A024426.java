package irvine.oeis.a024;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024426 <code>a(n) = floor((1/n)*(S(n,1) + S(n,2) + ... + S(n,n)))</code>, where <code>S(i,j)</code> are Stirling numbers of second kind.
 * @author Sean A. Irvine
 */
public class A024426 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      sum = sum.add(Stirling.secondKind(mN, k));
    }
    return sum.divide(mN);
  }
}
