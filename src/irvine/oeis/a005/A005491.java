package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005491 n^3 + 3n + 1.
 * @author Sean A. Irvine
 */
public class A005491 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().add(3).multiply(mN).add(1);
  }
}

