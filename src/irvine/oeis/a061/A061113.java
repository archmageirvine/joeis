package irvine.oeis.a061;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061113 Concatenation of numbers in n-th row of triangle of Stirling numbers of second kind (A008277).
 * @author Sean A. Irvine
 */
public class A061113 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder();
    for (int k = 1; k <= mN; ++k) {
      sb.append(Stirling.secondKind(mN, k));
    }
    return new Z(sb);
  }
}
