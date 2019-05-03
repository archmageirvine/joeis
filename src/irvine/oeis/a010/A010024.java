package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010024 Coordination sequence for squashed <code>{D_5}*</code> lattice, perhaps the smallest example of a <code>"non-superficial"</code> lattice.
 * @author Sean A. Irvine
 */
public class A010024 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return Z.ZERO.equals(mN)
      ? Z.ONE
      : mN.multiply(10).subtract(5).multiply(mN).add(20).multiply(mN).add(5).multiply(mN).divide(3).add(2);
  }
}
