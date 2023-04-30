package irvine.oeis.a227;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A227367 a(0)=1, a(n+1) = a(0) + a(1)*a(2) + a(3)*a(4)*a(5) + a(6)*a(7)*a(8)*a(9) + ... + ...*a(n).
 * @author Georg Fischer
 */
public class A227367 extends MemorySequence {

  private int mN;

  /** Construct the sequence. */
  public A227367() {
    super(0, 1);
    mN = -1;
  }

  /* Python:
  a = [1]*99
  for n in range(20):
    sum = i = 0
    k = 1
    while i<=n:
      product = 1
      for x in range(k):
        product *= a[i]
        i += 1
        if i>n: break
      sum += product
      k += 1
    a[n+1] = sum
    print(str(a[n]), end=', ')
  */
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
        product = product.multiply(a(i));
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
