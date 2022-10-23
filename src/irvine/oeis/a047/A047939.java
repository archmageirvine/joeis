package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A047939 Number of 4-colorings of an n X n grid, up to rotational symmetry.
 * @author Sean A. Irvine
 */
public class A047939 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(2 * mN * mN).add(Z.TWO.shiftLeft(2 * ((mN * mN + 3) / 4))).add(Z.ONE.shiftLeft(mN * mN + (mN & 1))).shiftRight(2);
  }
}
