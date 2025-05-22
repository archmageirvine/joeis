package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077436 Let B(n) be the sum of binary digits of n. This sequence contains n such that B(n) = B(n^2).
 * @author Sean A. Irvine
 */
public class A077436 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      if (Long.bitCount(mN) == n.square().bitCount()) {
        return n;
      }
    }
  }
}
