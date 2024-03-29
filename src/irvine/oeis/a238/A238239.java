package irvine.oeis.a238;
// Generated by gen_seq4.pl decexpr at 2021-07-25 17:16

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A238239 Decimal expansion of the polar angle, in degrees, of a cone which makes a golden-ratio cut of the full solid angle.
 * Formula: arccos(4/(1+sqrt(5))-1)*180/Pi
 * @author Georg Fischer
 */
public class A238239 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A238239() {
    super(2, REALS.acos(CR.FOUR.divide(CR.ONE.add(CR.FIVE.sqrt())).subtract(CR.ONE)).multiply(CR.valueOf(180)).divide(CR.PI));
  }
}
