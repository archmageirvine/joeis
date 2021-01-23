package irvine.oeis.a024;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024427 S(n,1) + S(n-1,2) + S(n-2,3) + ... + S(n+1-k,k), where k = floor((n+1)/2) and S(i,j) are Stirling numbers of the second kind.
 * @author Sean A. Irvine
 */
public class A024427 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= (mN + 1) / 2; ++k) {
      sum = sum.add(Stirling.secondKind(mN + 1 - k, k));
    }
    return sum;
  }
}
