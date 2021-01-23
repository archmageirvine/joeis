package irvine.oeis.a031;

import irvine.math.z.DirichletSeries;
import irvine.math.z.Z;

/**
 * A031361 Number of symmetrically inequivalent coincidence rotations of index n in lattice Z^4.
 * @author Sean A. Irvine
 */
public class A031361 extends A031360 {

  private final DirichletSeries mA = new DirichletSeries();
  private final DirichletSeries mB = new DirichletSeries();
  {
    mA.put(Z.ONE, Z.ONE);
    mA.put(Z.TWO, Z.TWO);
  }
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    mB.put(Z.valueOf(2 * mN - 1), super.next());
    return mA.multiply(mB, mN).coeff(mN);
  }
}
