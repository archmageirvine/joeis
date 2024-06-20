package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.memory.MemorySequence;

/**
 * A010060 Thue-Morse sequence: let A_k denote the first 2^k terms; then A_0 = 0 and for k &gt;= 0, A_{k+1} = A_k B_k, where B_k is obtained from A_k by interchanging 0's and 1's.
 * @author Sean A. Irvine
 */
public class A010060 extends MemorySequence implements DirectSequence {

  @Override
  protected Z computeNext() {
    return size() == 0 ? Z.ZERO : Z.valueOf(Integer.bitCount(size()) & 1);
  }

  @Override
  public Z a(final int n) {
    return (n == 0) ? Z.ZERO : Z.valueOf(Integer.bitCount(n) & 1);
  }

  @Override
  public Z a(final Z n) {
    return n.isZero() ? Z.ZERO : Z.valueOf(n.bitCount() & 1);
  }
}
