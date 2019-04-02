package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005570 Number of walks on cubic lattice.
 * @author Sean A. Irvine
 */
public class A005570 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().multiply(8).add(mN.multiply(9));
  }
}

