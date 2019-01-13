package irvine.oeis.a034;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034444.
 * @author Sean A. Irvine
 */
public class A034444 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return Z.valueOf(Cheetah.factor(mN).unitarySigma0());
  }
}

