package irvine.oeis.a106;

import irvine.math.z.Z;
import irvine.oeis.a010.A010060;

/**
 * A106400 Thue-Morse sequence: let <code>A_k</code> denote the first <code>2^k</code> terms; then <code>A_0 = 1</code> and for k <code>&gt;= 0, A_{k+1} = A_k B_k</code>, where <code>B_k</code> is obtained from <code>A_k</code> by interchanging <code>1</code>'s and <code>-1</code>'s.
 * @author Sean A. Irvine
 */
public class A106400 extends A010060 {

  @Override
  public Z next() {
    return super.next().signum() == 0 ? Z.ONE : Z.NEG_ONE;
  }
}

