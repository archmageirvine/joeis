package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026898 a(n) = Sum_{k=0..n} (n-k+1)^k.
 * @author Sean A. Irvine
 */
public class A026898 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Z.valueOf(mN - k + 1).pow(k));
    }
    return sum;
  }
}
