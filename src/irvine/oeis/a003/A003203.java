package irvine.oeis.a003;

import java.util.Arrays;

import irvine.math.group.PolynomialRing;
import irvine.math.lattice.Hunter;
import irvine.math.lattice.Lattices;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003203 Cluster series for square lattice.
 * @author Sean A. Irvine
 */
public class A003203 implements Sequence {    

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> C = RING.oneMinusXToTheN(1);
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;
  private Polynomial<Z> mS = RING.one();
  private long[] mPerimeterCounts = null;

  @Override
  public Z next() {
    if (++mN > 0) {
      mPerimeterCounts = new long[2 * mN + 3];
      final Hunter h = new Hunter(Lattices.Z2, true) {
        {
          setKeeper((animal, forbidden) -> ++mPerimeterCounts[animal.perimeterSize(Lattices.Z2)]);
        }
      };
      h.count(mN);
      mS = RING.add(mS, RING.multiply(RING.substitute(Polynomial.create(mPerimeterCounts), C, Integer.MAX_VALUE), Z.valueOf(mN).square()).shift(mN));
      if (mVerbose) {
        System.out.println(mN + " perimeter polynomial " + Arrays.toString(mPerimeterCounts));
      }
    }
    return mS.coeff(mN);
  }
}
