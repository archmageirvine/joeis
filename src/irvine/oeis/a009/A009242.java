package irvine.oeis.a009;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009242.
 * @author Sean A. Irvine
 */
public class A009242 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.lcm(Cheetah.factor(mN).sigma());
  }
}
