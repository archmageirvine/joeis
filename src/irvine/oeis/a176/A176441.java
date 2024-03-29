package irvine.oeis.a176;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A176441 Decimal expansion of sqrt(210).
 * @author Georg Fischer
 */
public class A176441 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A176441() {
    super(2, CR.valueOf(210).sqrt());
  }
}
