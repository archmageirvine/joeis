package irvine.oeis.a104;

import irvine.math.cr.CR;
import irvine.math.cr.ZPolynomialFunction;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a077.A077800;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A383820 allocated for Artur Jasinski.
 * @author Sean A. Irvine
 */
public class A104225 extends DecimalExpansionSequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);

  /** Construct the sequence. */
  public A104225() {
    super(0, new CR() {

      private Polynomial<Z> makePoly(final int n) {
        final Sequence twins = new A077800();
        final Polynomial<Z> res = RING.empty();
        res.add(Z.ONE);
        for (int k = 0; k < n; ++k) {
          res.add(twins.next());
        }
        return res;
      }

      @Override
      protected Z approximate(final int precision) {
        int k = 100;
        Z a = new ZPolynomialFunction(makePoly(100)).inverseMonotone(CR.valueOf(-0.67), CR.valueOf(-0.66)).execute(CR.ZERO).getApprox(precision);
        while (true) {
          k += 50;
          final Z b = new ZPolynomialFunction(makePoly(k)).inverseMonotone(CR.valueOf(-0.67), CR.valueOf(-0.66)).execute(CR.ZERO).getApprox(precision);
          if (a.equals(b)) {
            return b;
          }
          a = b;
        }
      }
    }.negate());
  }
}

