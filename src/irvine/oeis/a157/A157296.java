package irvine.oeis.a157;
// Generated by gen_seq4.pl dexcr CR.valueOf(31185).divide(CR.TWO.multiply(REALS.pow(CR.PI, CR.EIGHT))) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A157296 Decimal expansion of 31185/(2*Pi^8).
 * @author Georg Fischer
 */
public class A157296 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A157296() {
    super(CR.valueOf(31185).divide(CR.TWO.multiply(REALS.pow(CR.PI, CR.EIGHT))));
  }
}
