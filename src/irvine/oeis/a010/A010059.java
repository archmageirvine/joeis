package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010059 Another version of the Thue-Morse sequence: let <code>A_k</code> denote the first <code>2^k</code> terms; then <code>A_0 = 1</code> and for k <code>&gt;= 0, A_{k+1} = A_k B_k</code>, where <code>B_k</code> is obtained from <code>A_k</code> by interchanging <code>0</code>'s and <code>1</code>'s.
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

