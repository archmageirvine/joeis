package irvine.oeis.a081;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A081126 Binomial transform of n!/floor(n/2)!.
 * @author Sean A. Irvine
 */
public class A081126 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    Z f = Z.ONE;
    for (int k = 0; k <= mN; ++k) {
      if (k > 1) {
        f = f.multiply(k);
        if ((k & 1) == 0) {
          f = f.divide(k / 2);
        }
      }
      sum = sum.add(Binomial.binomial(mN, k).multiply(f));
    }
    return sum;
  }
}

