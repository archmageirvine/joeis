package irvine.oeis.a242;
// Generated by gen_seq4.pl dex CR.SEVEN.sqrt().divide(CR.TWO) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A242703 Decimal expansion of sqrt(7)/2.
 * @author Georg Fischer
 */
public class A242703 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A242703() {
    super(CR.SEVEN.sqrt().divide(CR.TWO));
  }
}
