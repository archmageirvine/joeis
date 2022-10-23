package irvine.oeis.a027;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A027710 Number of ways of placing n labeled balls into n unlabeled (but 3-colored) boxes.
 * @author Sean A. Irvine
 */
public class A027710 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    Z t = Z.ONE;
    for (long k = 0; k <= mN; ++k, t = t.multiply(3)) {
      sum = sum.add(t.multiply(Stirling.secondKind(mN, k)));
    }
    return sum;
  }
}
