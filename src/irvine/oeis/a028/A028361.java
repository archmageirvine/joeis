package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028361 Number of totally isotropic spaces of index n in orthogonal geometry of dimension 2n.
 * @author Sean A. Irvine
 */
public class A028361 implements Sequence {

  private int mN = -2;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN >= 0) {
      mA = mA.multiply(Z.ONE.shiftLeft(mN).add(1));
    }
    return mA;
  }
}

