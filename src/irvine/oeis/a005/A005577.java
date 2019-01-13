package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a259.A259095;

/**
 * A005577.
 * @author Sean A. Irvine
 */
public class A005577 extends A259095 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ONE;
    for (int k = 2; k <= mN; ++k) {
      final Z t = a259095(mN, k);
      max = max.max(t);
    }
    return max;
  }
}

