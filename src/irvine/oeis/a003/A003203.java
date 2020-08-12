package irvine.oeis.a003;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import jmason.poly.ChildGeneratorFactory;
import jmason.poly.CoordSet2;
import jmason.poly.Polyomino;
import jmason.poly.UniquenessTester;

/**
 * A003203.
 * @author Sean A. Irvine
 */
public class A003203 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> C = RING.oneMinusXToTheN(1);
  private UniquenessTester mUnique = new UniquenessTester();
  private int mN = 0;
  private Polynomial<Z> mS = RING.one();
  private long[] mPerimeterCounts = null;

  private void count(final int c, final int max, final Polyomino p) {
    if (!mUnique.add(p.getUniq())) {
      return;
    }
    if (c == max) {
      ++mPerimeterCounts[p.perimeterSize()];
    } else {
      for (final Polyomino son : ChildGeneratorFactory.POLYOMINO_GENERATOR.listSons(p, 0)) {
        count(c + 1, max, son);
      }
    }
  }

  @Override
  public Z next() {
    if (++mN > 0) {
      mPerimeterCounts = new long[2 * mN + 3];
      mUnique = new UniquenessTester();
      final CoordSet2 cs = new CoordSet2(1, true, true, false);
      cs.initMonomino();
      count(1, mN, new Polyomino(cs));
      mS = RING.add(mS, RING.multiply(RING.substitute(Polynomial.create(mPerimeterCounts), C, Integer.MAX_VALUE), Z.valueOf(mN).square()).shift(mN));
    }
    return mS.coeff(mN);
  }
}
