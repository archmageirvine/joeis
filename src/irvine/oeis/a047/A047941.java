package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A047941 Number of 6-colorings of an n X n grid, up to rotational symmetry.
 * @author Sean A. Irvine
 */
public class A047941 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.SIX.pow((long) mN * mN).add(Z.SIX.pow(((long) mN * mN + 3) / 4).multiply2()).add(Z.SIX.pow(((long) mN * mN + 1) / 2)).shiftRight(2);
  }
}
