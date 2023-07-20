package irvine.oeis.a229;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A229653 Trisection a(3n+k) gives k-th differences of a for k=0..2 with a(n)=0 for n&lt;2 and a(2)=1.
 * @author Georg Fischer
 */
public class A229653 extends MemorySequence {

  private int mSect;

  /** Construct the sequence. */
  public A229653() {
    this(3);
  }

  /**
   * Generic constructor with parameters
   * @param sect parameter section
   */
  public A229653(final int sect) {
    mSect = sect;
  }

  /* Maple:
    a:= proc(n) option remember; local m, q;
      m:= irem(n, 3, 'q'); `if`(n<3, `if`(n=2, 1, 0),
      add(a(q+m-j)*(-1)^j*binomial(m, j), j=0..m))
    end:
    seq(a(n), n=0..100);
  */
  @Override
  protected Z computeNext() {
    final int n = size();
    final int m = n % mSect;
    final int q = n / mSect;
    if (n < mSect) {
      return n == (mSect - 1) ? Z.ONE : Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (int j = 0; j <= m; ++j) {
      sum = sum.add(a(q + m - j).multiply(((j & 1) == 0) ? 1 : -1).multiply(Binomial.binomial(m, j)));
    }
    return sum;
  }
}
