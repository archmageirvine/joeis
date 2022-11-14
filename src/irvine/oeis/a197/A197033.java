package irvine.oeis.a197;

import irvine.math.cr.CR;
import irvine.math.cr.ZPolynomialFunction;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A197033 Decimal expansion of the shortest distance from the x axis through (2,1) to the line y=x.
 * @author Georg Fischer
 */
public class A197033 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A197033() {
    this(1, 1 * A197032.MF2, 2, 1, "2.3");
  }

  /**
   * Generic constructor with parameters.
   * @param offset first index
   * @param m2 slope * MF2
   * @param h point (x-coordinate)
   * @param k point (y-coordinate)
   * @param lo lower bound for root searching interval for t (upper bound is lo + 0.1)
   */
  public A197033(final int offset, final int m2, final int h, final int k, final String lo) {
    super(offset, getCR(m2, h, k, lo), 10);
  }

  /**
   * Compute the constant.
   * @param m2 slope * MF2
   * @param h point (x-coordinate)
   * @param k point (y-coordinate)
   * @param lo lower bound for root searching interval for t (upper bound is lo + 0.1)
   * @return the constant
   */
  private static CR getCR(final int m2, final int h, final int k, final String lo) {
    final Polynomial<Z> poly = A197032.getPolynomial(m2, h, k);
    final CR ct = new ZPolynomialFunction(poly).inverseMonotone(CR.valueOf(lo), CR.valueOf(lo).add(CR.valueOf("0.1"))).execute(CR.ZERO);
    final CR cm = CR.valueOf(m2).divide(CR.valueOf(A197032.MF2));
    final CR ch = CR.valueOf(h);
    final CR ck = CR.valueOf(k);
    // f[t_] := (t - k*t/(k + m*t - m*h))^2 + (m*k*t/(k + m*t - m*h))^2;
    final CR ckmtmh = ck.add(cm.multiply(ct)).subtract(cm.multiply(ch));
    return (ct.subtract(ck.multiply(ct).divide(ckmtmh))).square()
      .add(cm.multiply(ck).multiply(ct).divide(ckmtmh).square())
      .sqrt();
  }
}
