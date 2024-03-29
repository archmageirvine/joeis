package irvine.oeis.a234;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A234468 Decimal expansion of log(27/4)/log(8).
 * @author Georg Fischer
 */
public class A234468 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A234468() {
    super(0, CR.valueOf(27).divide(CR.FOUR).log().divide(CR.EIGHT.log()));
  }
}
