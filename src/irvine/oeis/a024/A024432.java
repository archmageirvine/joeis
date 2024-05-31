package irvine.oeis.a024;

import java.util.Arrays;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024432 a(n) = t(1) - t(2) + t(3) + ... + c*t(n), where c = (-1)^(n+1) and t(j) are Stirling numbers S(n,k) in decreasing order, for k = 1,2,...,n.
 * @author Sean A. Irvine
 */
public class A024432 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z[] s2 = new Z[mN];
    for (int k = 1; k <= mN; ++k) {
      s2[k - 1] = Functions.STIRLING2.z(mN, k);
    }
    Arrays.sort(s2);
    Z sum = Z.ZERO;
    for (int k = 1; k <= s2.length; ++k) {
      sum = sum.signedAdd((k & 1) == 1, s2[s2.length - k]);
    }
    return sum;
  }
}
