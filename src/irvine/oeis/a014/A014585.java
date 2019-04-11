package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014585 Number of Hamiltonian paths in <code>a 5</code> X n grid starting in the lower left corner and ending in the lower right.
 * @author Sean A. Irvine
 */
public class A014585 extends A014584 {

  private int mN = -1;

  @Override
  public Z next() {
    return mG.get(++mN);
  }
}
