package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395592 Decimal expansion of the positive real root of x^4 - 3*x^3 - 4*x^2 - 2*x - 1.
 * @author Sean A. Irvine
 */
public class A395592 extends DecimalExpansionSequence {

  private static final CR SQRT13 = CR.valueOf(13).sqrt();

  /** Construct the sequence. */
  public A395592() {
    super(1, SQRT13.add(3).add(SQRT13.multiply(14).add(46).sqrt()).divide(4));
  }
}
