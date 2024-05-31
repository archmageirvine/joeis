package irvine.oeis.a032;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A032183 "CIJ" (necklace, indistinct, labeled) transform of 3,3,3,3...
 * @author Sean A. Irvine
 */
public class A032183 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    Z f = Z.THREE;
    for (int k = 1; k <= mN; f = f.multiply(3L * k++)) {
      sum = sum.add(f.multiply(Functions.STIRLING2.z(mN, k)));
    }
    return sum;
  }
}
