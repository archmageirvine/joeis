package irvine.oeis.a033;

import irvine.math.cr.CR;
import irvine.math.cr.Convergents;
import irvine.math.predicate.Predicates;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000037;

/**
 * A033313 Smallest positive integer x satisfying the Pell equation x^2 - D*y^2 = 1 for nonsquare D and positive y.
 * @author Sean A. Irvine
 */
public class A033313 extends A000037 {

  protected Z mD; // for A033316

  protected Z select(final Q conv) {
    return conv.num();
  }

  /**
   * Solve a Pell equation.
   * @param d discriminant
   * @return solution
   */
  public static Q solvePell(final Z d) {
    if (Predicates.SQUARE.is(d)) {
      return Q.NEG_ONE;
    }
    final Convergents cv = new Convergents(CR.valueOf(d).sqrt());
    while (true) {
      final Q conv = cv.next();
      if (conv.num().square().subtract(d.multiply(conv.den().square())).isOne()) {
        return conv;
      }
    }
  }

  @Override
  public Z next() {
    mD = super.next();
    return select(solvePell(mD));
  }
}

