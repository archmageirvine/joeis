package irvine.oeis.a009;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009191.
 * @author Sean A. Irvine
 */
public class A009191 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.gcd(Z.valueOf(Cheetah.factor(mN).sigma0()));
  }
}
