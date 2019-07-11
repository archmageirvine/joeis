package irvine.oeis.a024;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024433 <code>a(n) =</code> difference between greatest two Stirling numbers <code>S(n,k)</code> of second kind, for k <code>= 1,2,...,n</code>.
 * @author Sean A. Irvine
 */
public class A024433 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ZERO;
    Z maxButOne = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      final Z s2 = Stirling.secondKind(mN, k);
      if (s2.compareTo(max) > 0) {
        maxButOne = max;
        max = s2;
      } else if (s2.compareTo(maxButOne) > 0) {
        maxButOne = s2;
      }
    }
    return max.subtract(maxButOne);
  }
}
