package irvine.oeis.a190;
// Generated by gen_seq4.pl dex CR.ONE.add(CR.SQRT2).add(CR.SEVEN.add(CR.SIX.multiply(CR.SQRT2)).sqrt()).divide(CR.TWO) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A190177 Decimal expansion of (1+sqrt(2)+sqrt(7+6*sqrt(2)))/2.
 * @author Georg Fischer
 */
public class A190177 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A190177() {
    super(CR.ONE.add(CR.SQRT2).add(CR.SEVEN.add(CR.SIX.multiply(CR.SQRT2)).sqrt()).divide(CR.TWO));
  }
}
