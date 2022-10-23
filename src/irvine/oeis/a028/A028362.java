package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028362 Total number of self-dual binary codes of length 2n. Totally isotropic spaces of index n in symplectic geometry of dimension 2n.
 * @author Sean A. Irvine
 */
public class A028362 extends Sequence1 {

  private int mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(Z.ONE.shiftLeft(mN).add(1));
    }
    return mA;
  }
}

