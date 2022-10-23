package irvine.oeis.a002;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002870 Largest Stirling numbers of second kind: a(n) = max_{k=1..n} S2(n,k).
 * @author Sean A. Irvine
 */
public class A002870 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z m = Z.ONE;
    ++mN;
    for (int k = 1; k <= mN; ++k) {
      m = m.max(Stirling.secondKind(mN, k));
    }
    return m;
  }
}
