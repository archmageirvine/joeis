package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A059894 Complement and reverse the order of all but the most significant bit in binary expansion of n. n = 1ab..yz -&gt; 1ZY..BA = a(n), where A = 1-a, B = 1-b, ... .
 * @author Sean A. Irvine
 */
public class A059894 extends Sequence1 {

  private long mN = 0;
  private long mBit = 1;

  @Override
  public Z next() {
    if (++mN >= mBit) {
      mBit <<= 1;
    }
    final long rev = ZUtils.reverse(Z.valueOf(mN), 2).divide2().longValueExact();
    return Z.valueOf(~rev & (mBit - 1));
  }
}
