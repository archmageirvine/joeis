package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005570 Number of walks on cubic lattice.
 * @author Sean A. Irvine
 */
public class A005570 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().multiply(8).add(mN.multiply(9));
  }
}

