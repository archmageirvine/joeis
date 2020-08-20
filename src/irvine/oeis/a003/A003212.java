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
 * A003212.
 * @author Sean A. Irvine
 */
public class A003212 implements Sequence {

  // todo this is currently broken, might actually need complement of diamond
  // todo for larger n appears to get twice the required value, but wrong for small n

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> C = RING.oneMinusXToTheN(1);
  private int mN = 0;
  private Polynomial<Z> mS = RING.one();
  private long[] mPerimeterCounts = null;

  @Override
  public Z next() {
    if (++mN > 0) {
      mPerimeterCounts = new long[2 * mN + 3];
      final Hunter h = new Hunter(Lattices.DIAMOND, true) {
        {
          setKeeper(animal -> ++mPerimeterCounts[animal.perimeterSize(Lattices.DIAMOND)]);
        }
      };
      h.count(mN);
      System.out.println(Arrays.toString(mPerimeterCounts));
      mS = RING.add(mS, RING.multiply(RING.substitute(Polynomial.create(mPerimeterCounts), C, Integer.MAX_VALUE), Z.valueOf(mN).square()).shift(mN));
    }
    return mS.coeff(mN);
  }
}
