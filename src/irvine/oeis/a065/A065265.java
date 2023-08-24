package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A065265 A065263 conjugated with A059893, inverse of A065266.
 * @author Sean A. Irvine
 */
public class A065265 extends Sequence1 {

  private long mN = 0;

  // if n = 1ab..yz then a(n) = 1zy..ba
  static Z specialReverse(final Z n) {
    final Z rev = ZUtils.reverse(n, 2).divide2();
    return Z.ONE.shiftLeft(n.bitLength() - 1).add(rev);
  }

  @Override
  public Z next() {
    return specialReverse(A065263.compute(specialReverse(Z.valueOf(++mN)).longValueExact()));
  }
}
