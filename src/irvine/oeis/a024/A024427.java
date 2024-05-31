package irvine.oeis.a024;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024427 S(n,1) + S(n-1,2) + S(n-2,3) + ... + S(n+1-k,k), where k = floor((n+1)/2) and S(i,j) are Stirling numbers of the second kind.
 * @author Sean A. Irvine
 */
public class A024427 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= (mN + 1) / 2; ++k) {
      sum = sum.add(Functions.STIRLING2.z(mN + 1 - k, k));
    }
    return sum;
  }
}
