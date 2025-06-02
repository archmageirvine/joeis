package irvine.oeis.a077;

import irvine.math.cr.CR;
import irvine.math.cr.ZPolynomialFunction;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a074.A074586;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A077601 Decimal expansion of the limit of the maximum real root of M(n,-x) as n -&gt; infinity, where M(n,x) is the n-th Moebius polynomial and satisfies M(n,-1) = mu(n) the Moebius function of n.
 * @author Sean A. Irvine
 */
public class A077601 extends DecimalExpansionSequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);

  /** Construct the sequence. */
  public A077601() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Sequence r = new A074586();
        long k = 0;
        Z a = Z.ZERO;
        while (true) {
          ++k;
          final Polynomial<Z> p = RING.empty();
          for (long j = 0; j < k; ++j) {
            p.add(r.next().multiply(Z.NEG_ONE.pow(j)));
          }
          if (k > 5) {
            final Z t = new ZPolynomialFunction(p).inverseMonotone(CR.valueOf(2.6), CR.THREE).execute(CR.ZERO).getApprox(precision);
            if (t.equals(a)) {
              return a;
            }
            a = t;
          }
        }
      }
    });
  }
}
