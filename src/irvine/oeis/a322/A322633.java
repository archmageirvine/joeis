package irvine.oeis.a322;

import irvine.math.cr.CR;
import irvine.math.cr.ZPolynomialFunction;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A322633 Decimal expansion of the real solution to 11571875*x^5 - 5363750*x^4 + 628250*x^3 - 97580*x^2 + 5180*x - 142 = 0, multiplied by 3/7. Constant occurring in the asymptotic behavior of the number of lattice paths of slope 2/5, observed by D. Knuth.
 * Polynomial: 11571875*x^5-5363750*x^4+628250*x^3-97580*x^2+5180*x-142
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A322633 extends DecimalExpansionSequence {

  private static final CR C = CR.valueOf(new Q(3, 7));

  /** Construct the sequence. */
  public A322633() {
    super(0, new ZPolynomialFunction(Polynomial.create(-142, 5180, -97580, 628250, -5363750, 11571875)).inverseMonotone(CR.ZERO, CR.ONE).execute(CR.ZERO).multiply(C));
  }
}
