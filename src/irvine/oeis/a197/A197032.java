package irvine.oeis.a197;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A197032 Decimal expansion of the x-intercept of the shortest segment from the positive x axis through (2,1) to the line y=x.
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
public class A197032 extends PolynomialRootExpansionSequence {

  protected static final int MF2 = 2;

  /** Construct the sequence. */
  public A197032() {
    this(1, MF2, 2, 1, "2.3");
  }

  /**
   * Generic constructor with parameters.
   * @param offset first index
   * @param m2 slope * <code>MF2</code>
   * @param h point (x-coordinate)
   * @param k point (y-coordinate)
   * @param lo lower bound for root searching interval (upper bound is lo + 0.1)
   */
  public A197032(final int offset, final int m2, final int h, final int k, final String lo) {
    super(offset, getPolynomial(m2, h, k), CR.valueOf(lo), CR.valueOf(lo).add(CR.valueOf("0.1")));
  }

  /**
   * Compute the polynomial.
   * @param m2 slope * <code>MF2</code>
   * @param h point (x-coordinate)
   * @param k point (y-coordinate)
   * @return Polynomial in <code>t</code> with coefficients
   * <code>p[t_] := h^2 k + k^3 - h^3 m - h k^2 m - 3 h k t + 3 h^2 m t + 2 k t^2 - 3 h m t^2 + m t^3</code>
   */
  public static Polynomial<Z> getPolynomial(final int m2, final int h, final int k) {
    final int c0 = (h * h * k + k * k * k) * MF2 - (h * h + k * k) * h * m2;
    final int c1 = (-3 * h * k) * MF2 + (3 * h * h) * m2;
    final int c2 = (2 * k) * MF2 - (3 * h) * m2;
    final int c3 = m2;
    // System.out.println("c0=" + c0 + ", c1=" + c1 + ", c2=" + c2 + ", c3=" + c3);
    return Polynomial.create(c0, c1, c2, c3); // (-5, 6, -4, 1)
  }
}
