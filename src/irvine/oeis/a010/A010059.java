package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A010059 Another version of the Thue-Morse sequence: let A_k denote the first 2^k terms; then A_0 = 1 and for k &gt;= 0, A_{k+1} = A_k B_k, where B_k is obtained from A_k by interchanging 0's and 1's.
 * @author Sean A. Irvine
 */
public class A010059 extends Sequence0 implements DirectSequence {

  private int mN = -1;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return ((n.bitCount() & 1) == 0) ? Z.ONE : Z.ZERO;
  }

  @Override
  public Z a(final int n) {
    return ((Integer.bitCount(n) & 1) == 0) ? Z.ONE : Z.ZERO;
  }

}

