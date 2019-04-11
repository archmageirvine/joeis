package irvine.oeis.a106;

import irvine.math.z.Z;
import irvine.oeis.a010.A010060;

/**
 * A106400 Thue-Morse sequence: let A_k denote the first 2^k terms; then A_0 <code>= 1</code> and for k <code>&gt;= 0,</code> A_{k+1} = A_k B_k, where B_k is obtained from A_k by interchanging 1's and -1's.
 * @author Sean A. Irvine
 */
public class A106400 extends A010060 {

  @Override
  public Z next() {
    return super.next().signum() == 0 ? Z.ONE : Z.NEG_ONE;
  }
}

