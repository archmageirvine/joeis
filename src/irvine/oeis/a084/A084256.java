package irvine.oeis.a084;

import irvine.math.cr.CR;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.oeis.cons.DecimalExpansionSequence;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A084256 Decimal expansion of x such that x^2 + x^3 + x^5 + x^7 + x^11 + x^13 + x^17 + ... = 1.
 * @author Sean A. Irvine
 */
public class A084256 extends DecimalExpansionSequence {

  private static final long RUN_UP = 10;

  /** Construct the sequence. */
  public A084256() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final A000040 primes = new A000040();
        final PolynomialRing<Z> ring = new PolynomialRing<>(Integers.SINGLETON);
        final Polynomial<Z> poly = ring.empty();
        poly.add(Z.NEG_ONE);
        Z prev = Z.ZERO;
        long k = 0;
        while (true) {
          final Z p = primes.next();
          final int lim = p.intValueExact();
          while (poly.size() < lim) {
            poly.add(Z.ZERO);
          }
          poly.add(Z.ONE);
          if (++k > RUN_UP) {
            final Z t = new PolynomialRootExpansionSequence(poly, CR.ZERO, CR.ONE).getCR().getApprox(precision);
            if (t.equals(prev)) {
              return t;
            }
            prev = t;
          }
        }
      }
    });
  }
}
