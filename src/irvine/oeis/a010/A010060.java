package irvine.oeis.a010;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A010060 Thue-Morse sequence: let A_k denote the first 2^k terms; then A_0 = 0 and for k &gt;= 0, A_{k+1} = A_k B_k, where B_k is obtained from A_k by interchanging 0's and 1's.
 * @author Sean A. Irvine
 */
public class A010060 extends Sequence0 implements DirectSequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Functions.THUE_MORSE.z(++mN);
  }

  @Override
  public Z a(final int n) {
    return Functions.THUE_MORSE.z(n);
  }

  @Override
  public Z a(final Z n) {
    return Functions.THUE_MORSE.z(n);
  }
}
