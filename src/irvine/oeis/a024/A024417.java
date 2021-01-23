package irvine.oeis.a024;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024417 s(n,a(n)) = max{s(n,k): k=1,2,...,n}, n &gt;= 1, where s(n,k) = Stirling numbers of the second kind.
 * @author Sean A. Irvine
 */
public class A024417 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z m = Z.ZERO;
    int maxK = 0;
    ++mN;
    for (int k = 1; k <= mN; ++k) {
      final Z s2 = Stirling.secondKind(mN, k);
      if (s2.compareTo(m) > 0) {
        m = s2;
        maxK = k;
      }
    }
    return Z.valueOf(maxK);
  }
}
