package irvine.oeis.a024;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A024433 a(n) = difference between greatest two Stirling numbers S(n,k) of second kind, for k = 1,2,...,n.
 * @author Sean A. Irvine
 */
public class A024433 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ZERO;
    Z maxButOne = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      final Z s2 = Functions.STIRLING2.z(mN, k);
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
