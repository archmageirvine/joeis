package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A047945 Number of 10-colorings of an n X n grid, up to rotational symmetry.
 * @author Sean A. Irvine
 */
public class A047945 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.TEN.pow((long) mN * mN).add(Z.TEN.pow(((long) mN * mN + 3) / 4).multiply2()).add(Z.TEN.pow(((long) mN * mN + 1) / 2)).shiftRight(2);
  }
}
