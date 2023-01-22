package irvine.oeis.a061;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061115 Concatenation of numbers in n-th row of triangle of unsigned Stirling numbers of first kind (A008275).
 * @author Sean A. Irvine
 */
public class A061115 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder();
    for (int k = 1; k <= mN; ++k) {
      sb.append(Stirling.firstKind(mN, k));
    }
    return new Z(sb);
  }
}
