package irvine.oeis.a227;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A227364 a(n) = 1 + 2*3 + 4*5*6 + 7*8*9*10 + ... + ...*n  (see Example lines).
 * @author Georg Fischer
 */
public class A227364 extends Sequence0 {

  private int mN;

  /** Construct the sequence. */
  public A227364() {
    mN = -1;
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    int i = 1;
    int k = i;
    while (i <= mN) {
      Z product = Z.ONE;
      int x = 1;
      while (x <= k) {
        product = product.multiply(i);
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
