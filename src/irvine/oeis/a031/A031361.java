package irvine.oeis.a031;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Dirichlet;
import irvine.math.z.Z;

/**
 * A031361 Number of symmetrically inequivalent coincidence rotations of index n in lattice <code>Z^4</code>.
 * @author Sean A. Irvine
 */
public class A031361 extends A031360 {

  private final ArrayList<Z> mA = new ArrayList<>();
  private final ArrayList<Z> mB = new ArrayList<>();
  {
    mA.add(Z.ZERO);
    mA.add(Z.ONE);
    mA.add(Z.TWO);
    mB.add(Z.ZERO);
  }
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    mA.add(Z.ZERO);
    mB.add(super.next());
    mB.add(Z.ZERO);
    final List<Z> c = Dirichlet.dirichletProduct(mA, mB);
    return c.get(mN);
  }
}
