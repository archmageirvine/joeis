package irvine.oeis.a024;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024428 S(n,n) + S(n-1,n-2) + S(n-2,n-4) + ... + S(n-k+1,n-2k+2), where k = [ (n+1)/2 ] and S(i,j) are Stirling numbers of second kind.
 * @author Sean A. Irvine
 */
public class A024428 extends Sequence1 {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN / 2; ++k) {
      sum = sum.add(Stirling.secondKind(mN - k, mN + 1 - 2L * k));
    }
    return sum;
  }
}
