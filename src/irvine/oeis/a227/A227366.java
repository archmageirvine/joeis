package irvine.oeis.a227;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A227366 a(0)=1, a(n+1) = a(n) + a(n-1)*a(n-2) + a(n-3)*a(n-4)*a(n-5) + a(n-6)*a(n-7)*a(n-8)*a(n-9) + ... + ...*a(0).
 * @author Georg Fischer
 */
public class A227366 extends MemorySequence {

  private int mN;

  /** Construct the sequence. */
  public A227366() {
    super(0, 1);
    mN = -1;
  }

  @Override
  public Z computeNext() {
    ++mN;
    Z sum = Z.ZERO;
    int i = 0;
    int k = 1;
    while (i <= mN) {
      Z product = Z.ONE;
      int x = 1;
      while (x <= k) {
        product = product.multiply(a(mN - i));
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
