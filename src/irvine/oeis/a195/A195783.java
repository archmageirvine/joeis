package irvine.oeis.a195;
// Generated by gen_seq4.pl decexpr at 2021-07-13 19:05

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A195783 Decimal expansion of arcsec(8).
 * @author Georg Fischer
 */
public class A195783 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A195783() {
    super(1, REALS.asin(CR.THREE.multiply(CR.SEVEN.sqrt()).divide(CR.EIGHT)));
  }
}
