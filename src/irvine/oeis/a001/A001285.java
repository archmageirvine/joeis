package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicByteArray;

/**
 * A001285 Thue-Morse sequence: let A_k denote the first 2^k terms; then A_0 <code>= 1</code> and for k <code>&gt;= 0,</code> A_{k+1} = A_k B_k, where B_k is obtained from A_k by interchanging 1's and 2's.
 * @author Sean A. Irvine
 */
public class A001285 implements Sequence {

  private final LongDynamicByteArray mA = new LongDynamicByteArray();
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      mA.set(0, (byte) 1);
      return Z.ONE;
    }
    final byte b = (mN & 1) == 0 ? mA.get(mN >>> 1) : (byte) (3 - mA.get(mN >>> 1));
    mA.set(mN, b);
    return Z.valueOf(b);
  }

}
