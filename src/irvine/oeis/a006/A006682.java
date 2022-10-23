package irvine.oeis.a006;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A006682 Number of binary phylogenetic trees with n labels.
 * @author Sean A. Irvine
 */
public class A006682 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    final A006680 mA = new A006680();
    Z sum = Z.ZERO;
    for (long k = 2; k <= mN; ++k) {
      sum = sum.add(Stirling.secondKind(mN, k).multiply(mA.next()));
    }
    return sum;
  }
}
