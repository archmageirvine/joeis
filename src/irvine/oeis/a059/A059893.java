package irvine.oeis.a059;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A059893 Reverse the order of all but the most significant bit in binary expansion of n: if n = 1ab..yz then a(n) = 1zy..ba.
 * @author Sean A. Irvine
 */
public class A059893 extends Sequence1 implements DirectSequence {

  private long mN = 0;
  private long mBit = 1;

  @Override
  public Z next() {
    if (++mN >= mBit) {
      mBit <<= 1;
    }
    final long rev = Functions.REVERSE.z(2, mN).divide2().longValueExact();
    return Z.valueOf((mBit >>> 1) + rev);
  }

  @Override
  public Z a(final Z n) {
    return Functions.REVERSE.z(2, n).shiftRight(1).add(Z.ONE.shiftLeft(n.bitLength() - 1));
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

}
