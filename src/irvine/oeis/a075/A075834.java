package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A075834 Coefficients of power series A(x) such that n-th term of A(x)^n = n! x^(n-1) for n &gt; 0.
 * a(0) = a(1) = 1, a(2) = x, a(3) = 2x^2, a(n) = x*(n-1)*a(n-1) + Sum_{j=2..n-2} (j-1)*a(j)*a(n-j), n&gt;=4 and for x = 1.
 * @author Georg Fischer
 */
public class A075834 extends MemorySequence {

  private int mParm;

  /** Construct the sequence. */
  public A075834() {
    this(1);
  }

  /**
   * Generic constructor with parameter
   * @param parm parameter x
   */
  public A075834(final int parm) {
    mParm = parm;
  }

  @Override
  public Z computeNext() {
    final int n = size();
    switch (n) {
      case 0:
      case 1:
        return Z.ONE;
      case 2:
        return Z.valueOf(mParm);
      case 3:
        return Z.TWO.multiply(mParm * mParm);
      default:
        Z sum = a(n - 1).multiply((n - 1) * mParm);
        for (int j = 2; j <= n - 2; ++j) {
          sum = sum.add(a(j).multiply(a(n - j)).multiply(j - 1));
        }
        return sum;
    }
  }
}
