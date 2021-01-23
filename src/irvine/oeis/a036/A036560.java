package irvine.oeis.a036;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036560 StirlingS2[ n,m ] triangle summed down the columns.
 * @author Sean A. Irvine
 */
public class A036560 implements Sequence {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    Z sum = Z.ZERO;
    for (int n = 2; n <= mN; ++n) {
      sum = sum.add(Stirling.secondKind(n, mM));
    }
    return sum;
  }
}
