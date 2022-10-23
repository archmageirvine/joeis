package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A047937 Number of 2-colorings of an n X n grid, up to rotational symmetry.
 * @author Sean A. Irvine
 */
public class A047937 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(mN * mN).add(Z.TWO.shiftLeft((mN * mN + 3) / 4)).add(Z.ONE.shiftLeft((mN * mN + 1) / 2)).shiftRight(2);
  }
}
