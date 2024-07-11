package irvine.oeis.a106;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A106400 Thue-Morse sequence: let A_k denote the first 2^k terms; then A_0 = 1 and for k &gt;= 0, A_{k+1} = A_k B_k, where B_k is obtained from A_k by interchanging 1's and -1's.
 * @author Sean A. Irvine
 */
public class A106400 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Functions.THUE_MORSE.l(++mN) == 0 ? Z.ONE : Z.NEG_ONE;
  }
}

