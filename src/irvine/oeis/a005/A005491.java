package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005491 a(n) = n^3 + 3n + 1.
 * @author Sean A. Irvine
 */
public class A005491 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().add(3).multiply(mN).add(1);
  }
}

