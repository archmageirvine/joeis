package irvine.oeis.a171;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A171539 Decimal expansion of sqrt(6/35).
 * @author Georg Fischer
 */
public class A171539 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A171539() {
    super(0, CR.SIX.divide(CR.valueOf(35)).sqrt());
  }
}
