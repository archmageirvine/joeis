package irvine.oeis.a078;

import irvine.math.cr.CR;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.oeis.cons.DecimalExpansionSequence;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A078756 Decimal expansion of -x, where x is the unique nonzero real solution to Sum_{p prime} x^p = 0.
 * @author Sean A. Irvine
 */
public class A078756 extends DecimalExpansionSequence {

  private static final long RUN_UP = 10;
  private static final CR NEG_HALF = CR.valueOf(new Q(-1, 2));

  /** Construct the sequence. */
  public A078756() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final A000040 primes = new A000040();
        final PolynomialRing<Z> ring = new PolynomialRing<>(Integers.SINGLETON);
        Polynomial<Z> poly = ring.empty();
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
            final Z t = new PolynomialRootExpansionSequence(poly, CR.NEG_ONE, NEG_HALF).getCR().getApprox(precision);
            if (t.equals(prev)) {
              return t.abs();
            }
            prev = t;
          }
        }
      }
    });
  }
}
