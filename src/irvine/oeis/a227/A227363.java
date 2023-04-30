package irvine.oeis.a227;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A227363 a(n) = n + (n-1)*(n-2) + (n-3)*(n-4)*(n-5) + (n-6)*(n-7)*(n-8)*(n-9) + ... + ...*(n-n).
 * @author Georg Fischer
 */
public class A227363 extends Sequence0 {

  private int mN;

  /** Construct the sequence. */
  public A227363() {
    mN = -1;
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    int i = 0;
    int k = 1;
    while (i <= mN) {
      Z product = Z.ONE;
      int x = 1;
      while (x <= k) {
        product = product.multiply(mN - i);
        ++i;
        if (i > mN) {
          x = k;
        }
        ++x;
      }
      sum = sum.add(product);
      ++k;
    }
    return sum;
  }
}
