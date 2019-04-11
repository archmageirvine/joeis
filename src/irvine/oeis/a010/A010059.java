package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010059 Another version of the Thue-Morse sequence: let A_k denote the first <code>2^k</code> terms; then A_0 <code>= 1</code> and for <code>k &gt;= 0,</code> A_{k+1} = A_k B_k, where B_k is obtained from A_k by interchanging 0's and 1's.
 * @author Sean A. Irvine
 */
public class A010059 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return ((mN.bitCount() & 1) == 0) ? Z.ONE : Z.ZERO;
  }
}

