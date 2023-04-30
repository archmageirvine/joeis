package irvine.oeis.a081;
// manually adiveo at 2022-05-30 19:50

import irvine.math.z.Z;
import irvine.oeis.a068.A068915;

/**
 * A081742 a(1)=1; then if n is a multiple of 3, a(n) = a(n/3) + 1; if n is not a multiple of 3 but even, a(n) = a(n/2) + 1; a(n) = a(n-1) + 1 otherwise.
 * @author Georg Fischer
 */
public class A081742 extends A068915 {

  /** Construct the sequence */
  public A081742() {
    super(1, 3, 1);
    setOffset(1);
  }

  @Override
  public Z computeNext() {
    final int n = size();
    if (n - mOffset < mILen) {
      return Z.valueOf(mInits[n - mOffset]);
    }
    return (n % mModul == 0) ? a(n / 3).add(1) : (((n & 1) == 0) ? a(n / 2).add(1) : a(n - 1).add(1));
  }
}
