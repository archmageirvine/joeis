package irvine.oeis.a003;

import java.util.HashSet;
import java.util.List;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a001.A001207;

/**
 * A001207 Number of fixed hexagonal polyominoes with n cells.
 * @author Sean A. Irvine
 */
public class A003202 extends A001207 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> C = RING.oneMinusXToTheN(1);
  private int mN = 0;
  private Polynomial<Z> mS = RING.one();

  private int perimeter(final List<Point> animal) {
    final HashSet<Point> perimeter = new HashSet<>();
    for (final Point p : animal) {
      perimeter.addAll(neighborhoods(p));
    }
    perimeter.removeAll(animal);
    return perimeter.size();
  }

  @Override
  public Z next() {
    super.next(); // updates mPrev
    if (++mN > 0) {
      final long[] perimeterCounts = new long[2 * mN + 5];
      for (final List<Point> animal : mPrev) {
        ++perimeterCounts[perimeter(animal)];
      }
      mS = RING.add(mS, RING.multiply(RING.substitute(Polynomial.create(perimeterCounts), C, Integer.MAX_VALUE), Z.valueOf(mN).square()).shift(mN));
    }
    return mS.coeff(mN);
  }
}
