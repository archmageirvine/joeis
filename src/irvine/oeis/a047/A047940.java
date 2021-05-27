package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047940 Number of 5-colorings of an n X n grid, up to rotational symmetry.
 * @author Sean A. Irvine
 */
public class A047940 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.FIVE.pow(mN * mN).add(Z.FIVE.pow((mN * mN + 3) / 4).multiply2()).add(Z.FIVE.pow((mN * mN + 1) / 2)).shiftRight(2);
  }
}
