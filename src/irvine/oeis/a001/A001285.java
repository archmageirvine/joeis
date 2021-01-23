package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001285 Thue-Morse sequence: let A_k denote the first 2^k terms; then A_0 = 1 and for k &gt;= 0, A_{k+1} = A_k B_k, where B_k is obtained from A_k by interchanging 1's and 2's.
 * @author Sean A. Irvine
 */
public class A001285 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(1 + (Long.bitCount(++mN) & 1));
  }
}
