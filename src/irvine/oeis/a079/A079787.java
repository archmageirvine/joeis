package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079787 Sum of terms in n-th row of triangle in A079786.
 * @author Sean A. Irvine
 */
public class A079787 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.valueOf(++mN);
    for (long m = Functions.SIGMA0.l(mN) - 1; m > 0; --m) {
      long k = mN;
      while (k > 1) {
        if (Functions.SIGMA0.l(--k) == m) {
          sum = sum.add(k);
          break;
        }
      }
    }
    return sum;
  }
}

