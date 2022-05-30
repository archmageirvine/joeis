package irvine.oeis.a101;
// manually adiveo at 2022-05-30 20:25

import irvine.math.z.Z;
import irvine.oeis.a068.A068915;

/**
 * A101402 a(0)=0, a(1)=1; for n&gt;=2, let k = smallest power of 2 that is &gt;= n, then a(n) = a(k/2) + a(n-1-k/2).
 * @author Georg Fischer
 */
public class A101402 extends A068915 {

  /** Construct the sequence */
  public A101402() {
    super(0, 2, 0, 1);
  }

  @Override
  public Z computeNext() {
    final int n = size();
    if (n - mOffset < mILen) {
      return Z.valueOf(mInits[n - mOffset]);
    }
    int k2 = Integer.highestOneBit(n);
    if (k2 != n) {
      k2 <<= 1;
    }
    k2 >>= 1;
    return a(k2).add(a(n - 1 - k2));
  }
}
