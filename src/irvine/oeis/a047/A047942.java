package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A047942 Number of 7-colorings of an n X n grid, up to rotational symmetry.
 * @author Sean A. Irvine
 */
public class A047942 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.SEVEN.pow(mN * mN).add(Z.SEVEN.pow((mN * mN + 3) / 4).multiply2()).add(Z.SEVEN.pow((mN * mN + 1) / 2)).shiftRight(2);
  }
}
