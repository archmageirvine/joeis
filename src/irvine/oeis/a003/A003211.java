package irvine.oeis.a003;

import irvine.math.group.PolynomialRing;
import irvine.math.lattice.Hunter;
import irvine.math.lattice.Lattices;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003211 Cluster series for cubic lattice.
 * @author Sean A. Irvine
 */
public class A003211 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> C = RING.oneMinusXToTheN(1);
  private int mN = 0;
  private Polynomial<Z> mS = RING.one();
  private long[] mPerimeterCounts = null;

  @Override
  public Z next() {
    if (++mN > 0) {
      mPerimeterCounts = new long[4 * mN + 3];
      final Hunter h = new Hunter(Lattices.Z3, true) {
        {
          setKeeper((animal, forbidden) -> ++mPerimeterCounts[animal.perimeterSize(Lattices.Z3)]);
        }
      };
      h.count(mN);
      mS = RING.add(mS, RING.multiply(RING.substitute(Polynomial.create(mPerimeterCounts), C, Integer.MAX_VALUE), Z.valueOf(mN).square()).shift(mN));
    }
    return mS.coeff(mN);
  }
}
