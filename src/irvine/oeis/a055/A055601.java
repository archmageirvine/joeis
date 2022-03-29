package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055601 Number of n X n binary matrices with no zero rows.
 * @author Sean A. Irvine
 */
public class A055601 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN).subtract(1).pow(mN);
  }
}
