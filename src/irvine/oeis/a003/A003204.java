package irvine.oeis.a003;

import java.util.List;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import jmason.poly.CoordSet2T;
import jmason.poly.Polyiamond;
import jmason.poly.UniquenessTester;

/**
 * A003204 Cluster series for honeycomb.
 * @author Sean A. Irvine
 */
public class A003204 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> C = RING.oneMinusXToTheN(1);
  private UniquenessTester mUnique = new UniquenessTester();
  private int mN = 0;
  private Polynomial<Z> mS = RING.one();
  private long[] mPerimeterCounts = null;

  private void count(final int c, final int max, final Polyiamond p) {
    if (!mUnique.add(p.getUniq())) {
      return;
    }
    if (c == max) {
      ++mPerimeterCounts[p.perimeterSize()];
    } else {
      final List<Polyiamond> sons = p.listSons(0 /* onlyIfColour */); // guarantee of uniqueness
      for (final Polyiamond son : sons) {
        count(c + 1, max, son);
      }
    }
  }

  @Override
  public Z next() {
    if (++mN > 0) {
      mPerimeterCounts = new long[2 * mN + 3];
      if (mN == 1) {
        mPerimeterCounts[3] = 2;
      } else {
        mUnique = new UniquenessTester();
        final CoordSet2T cs = new CoordSet2T(1, true, true, false);
        cs.initMonoiamond();
        count(1, mN, new Polyiamond(cs));
      }
      mS = RING.add(mS, RING.multiply(RING.substitute(Polynomial.create(mPerimeterCounts), C, Integer.MAX_VALUE), Z.valueOf(mN).square()).shift(mN));
    }
    return mS.coeff(mN).divide2();
  }
}
