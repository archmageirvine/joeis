package irvine.oeis.a024;

import irvine.math.z.Binomial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024423 Sum of <code>[ S(n,m)/C(n-1,m-1) ]</code> for m <code>= 1,2,...,n; S(n,m)</code> are Stirling numbers of second kind.
 * @author Sean A. Irvine
 */
public class A024423 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      sum = sum.add(Stirling.secondKind(mN, k).divide(Binomial.binomial(mN - 1, k - 1)));
    }
    return sum;
  }
}
