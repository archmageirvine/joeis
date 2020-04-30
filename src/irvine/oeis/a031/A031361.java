package irvine.oeis.a031;

import java.util.ArrayList;
import java.util.List;

import irvine.factor.factor.Cheetah;
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

  static List<Z> dirichletProduct(final List<Z> a, final List<Z> b) {
    final int lim = Math.min(a.size(), b.size());
    final ArrayList<Z> c = new ArrayList<>(lim);
    for (int k = 0; k < lim; ++k) {
      Z s = Z.ZERO;
      for (Z dd : Cheetah.factor(k).divisors()) {
        final int d = dd.intValue();
        s = s.add(a.get(d).multiply(b.get(k / d)));
      }
      c.add(s);
    }
    return c;
  }

  @Override
  public Z next() {
    ++mN;
    mA.add(Z.ZERO);
    mB.add(super.next());
    mB.add(Z.ZERO);
    final List<Z> c = dirichletProduct(mA, mB);
    return c.get(mN);
  }
}
