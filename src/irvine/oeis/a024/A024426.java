package irvine.oeis.a024;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024426 a(n) = floor((1/n)*(S(n,1) + S(n,2) + ... + S(n,n))), where S(i,j) are Stirling numbers of second kind.
 * @author Sean A. Irvine
 */
public class A024426 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      sum = sum.add(Functions.STIRLING2.z(mN, k));
    }
    return sum.divide(mN);
  }
}
