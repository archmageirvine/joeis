package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038125 Sum_{k=0..n} (k-n)^k.
 * @author Sean A. Irvine
 */
public class A038125 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Z.valueOf(k - mN).pow(k));
    }
    return sum;
  }
}
