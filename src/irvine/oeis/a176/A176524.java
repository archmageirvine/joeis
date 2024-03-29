package irvine.oeis.a176;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A176524 Decimal expansion of sqrt(235).
 * @author Georg Fischer
 */
public class A176524 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A176524() {
    super(2, CR.valueOf(235).sqrt());
  }
}
