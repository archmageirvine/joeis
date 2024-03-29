package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A047943 Number of 8-colorings of an n X n grid, up to rotational symmetry.
 * @author Sean A. Irvine
 */
public class A047943 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(3L * mN * mN).add(Z.TWO.shiftLeft(3 * (((long) mN * mN + 3) / 4))).add(Z.ONE.shiftLeft(3 * (((long) mN * mN + 1) / 2))).shiftRight(2);
  }
}
