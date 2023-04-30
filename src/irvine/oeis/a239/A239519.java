package irvine.oeis.a239;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A239519 a(n) = n + (n-1)*(n-2) + (n-3)*(n-4)*(n-5) + (n-6)*(n-7)*(n-8)*(n-9) + ... + ...*1.
 * @author Georg Fischer
 */
public class A239519 extends Sequence0 {

  private int mN;

  /** Construct the sequence. */
  public A239519() {
    mN = -1;
  }

  /*
  for n in range(55):
    sum = i = 0
    k = 1
    while i<n:
      product = 1
      for x in range(k):
        product *= n - i
        i += 1
        if i>=n:  break
      sum += product
      k += 1
    print str(sum)+', ',

  */
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
        if (i >= mN) {
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
