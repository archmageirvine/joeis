package irvine.oeis.a027;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027882.
 * @author Sean A. Irvine
 */
public class A027882 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    Z kf = Z.ONE;
    for (int k = 1; k <= mN; kf = kf.multiply(k++)) {
      sum = sum.add(kf.multiply(Stirling.secondKind(mN, k)).shiftLeft(k));
    }
    return sum;
  }
}
