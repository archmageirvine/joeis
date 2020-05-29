package irvine.oeis.a032;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032183 "CIJ" <code>(necklace</code>, indistinct, labeled) transform of 3,3,3,3...
 * @author Sean A. Irvine
 */
public class A032183 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    Z f = Z.THREE;
    for (int k = 1; k <= mN; f = f.multiply(3L * k++)) {
      sum = sum.add(f.multiply(Stirling.secondKind(mN, k)));
    }
    return sum;
  }
}
