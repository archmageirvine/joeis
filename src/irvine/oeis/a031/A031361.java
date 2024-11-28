package irvine.oeis.a031;

import irvine.math.dirichlet.Dgf;
import irvine.math.dirichlet.Ds;
import irvine.math.dirichlet.FiniteDs;
import irvine.math.z.Z;

/**
 * A031361 Number of symmetrically inequivalent coincidence rotations of index n in lattice Z^4.
 * @author Sean A. Irvine
 */
public class A031361 extends A031360 {

  private final Ds mA = Dgf.from(1, 2);
  private final FiniteDs mB = Dgf.empty();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    mB.put(Z.valueOf(2L * mN - 1), super.next());
    return Dgf.multiply(mA, mB).coeff(mN);
  }
}
