package irvine.oeis.a112;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A112934 a(0) = 1; a(n+1) = Sum_{k=0..n} a(k)*A001147(n-k), where A001147 = double factorial numbers.
 * @author Georg Fischer
 */
public class A112934 extends MemorySequence {

  private final int mMult;

  /** Construct the sequence. */
  public A112934() {
    this(0, 2);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param mult order of the factorial: 2 = double, 3 = triple and so on
   */
  public A112934(final int offset, final int mult) {
    super(offset);
    mMult = mult;
  }

  @Override
  protected Z computeNext() {
    // a(n) = Sum_{k=0..n-1} a(k)*A001147(n-1-k); m := n - k; k = n - m; a(n) = Sum_{m=1..n} a(n - m)*A001147(n-1-(n - m))
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    Z f = Z.ONE;
    for (int k = 1; k <= n; ++k) {
      if (k > 1) {
        f = f.multiply(mMult * (k - 1) - 1);
      }
      // System.out.print(" f=" + f + ",sum=" + sum + ",a(n-k)=" + a(n - k));
      sum = sum.add(f.multiply(a(n - k)));
    }
    // System.out.println();
    return sum;
  }
}
