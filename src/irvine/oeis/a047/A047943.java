package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047943 Number of 8-colorings of an n X n grid, up to rotational symmetry.
 * @author Sean A. Irvine
 */
public class A047943 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(3 * mN * mN).add(Z.TWO.shiftLeft(3 * ((mN * mN + 3) / 4))).add(Z.ONE.shiftLeft(3 * ((mN * mN + 1) / 2))).shiftRight(2);
  }
}
