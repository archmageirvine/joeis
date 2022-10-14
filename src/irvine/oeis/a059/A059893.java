package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A059893 Reverse the order of all but the most significant bit in binary expansion of n: if n = 1ab..yz then a(n) = 1zy..ba.
 * @author Sean A. Irvine
 */
public class A059893 implements Sequence {

  private long mN = 0;
  private long mBit = 1;

  @Override
  public Z next() {
    if (++mN >= mBit) {
      mBit <<= 1;
    }
    final long rev = ZUtils.reverse(Z.valueOf(mN), 2).divide2().longValueExact();
    return Z.valueOf((mBit >>> 1) + rev);
  }
}
