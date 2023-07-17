package irvine.oeis.a244;

import irvine.math.z.Z;
import irvine.oeis.a299.A299038;
import irvine.oeis.triangle.Triangle;

/**
 * A244372 Number T(n,k) of unlabeled rooted trees with n nodes and maximal outdegree (branching factor) k; triangle T(n,k), n&gt;=1, 0&lt;=k&lt;=n-1, read by rows.
 * @author Georg Fischer
 */
public class A244372 extends Triangle {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A244372(final int offset) {
    super(offset);
  }

  /* Maple:
    b:= proc(n, i, t, k) as in A299038:
    T:= (n, k)-> b(n-1$2, k$2) -`if`(k=0, 0, b(n-1$2, k-1$2)):
    seq(seq(T(n, k), k=0..n-1), n=1..14);
  */
  protected final A299038 mSeq = new A299038();

  /** Construct the sequence. */
  public A244372() {
    setOffset(1);
    hasRAM(true);
  }

  @Override
  public Z compute(int n, final int k) {
    ++n;
    Z result = mSeq.b(n - 1, n - 1, k, k);
    if (k > 0) {
      result = result.subtract(mSeq.b(n - 1, n - 1, k - 1, k - 1));
    }
    return result;
  }
}
