package irvine.oeis.a334;
// Generated by gen_seq4.pl decexpr at 2021-07-19 22:15

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A334962 Decimal expansion of the distance from (0,0) to the nearest point of intersection of y = sec x and y = csc x.
 * Formula: sqrt(2+acot(1)^2)
 * @author Georg Fischer
 */
public class A334962 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A334962() {
    super(1, CR.TWO.add(REALS.acot(CR.ONE).pow(CR.TWO)).sqrt());
  }
}
