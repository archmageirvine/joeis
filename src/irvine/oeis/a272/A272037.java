package irvine.oeis.a272;

import irvine.math.cr.CR;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A272037 Decimal expansion of x such that x + x^4 + x^9 + x^16 + x^25 + x^36 + ... = 1.
 * @author Sean A. Irvine
 */
public class A272037 extends DecimalExpansionSequence {

  private static final Polynomial<Z> C3 = Polynomial.create(3);

  /** Construct the sequence. */
  public A272037() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final PolynomialRing<Z> ring = new PolynomialRing<>(Integers.SINGLETON);
        final Polynomial<Z> poly = ring.empty();
        poly.add(Z.NEG_ONE);
        Z prev = Z.ZERO;
        int k = 5;
        while (true) {
          final Z t = new PolynomialRootExpansionSequence(ring.subtract(ThetaFunctions.theta3z(++k * k), C3), CR.ZERO, CR.ONE).getCR().getApprox(precision);
          if (t.equals(prev)) {
            return t.abs();
          }
          prev = t;
        }
      }
    });
  }
}
