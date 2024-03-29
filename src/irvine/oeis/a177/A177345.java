package irvine.oeis.a177;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A177345 Decimal expansion of sqrt(2805).
 * @author Georg Fischer
 */
public class A177345 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A177345() {
    super(2, CR.valueOf(2805).sqrt());
  }
}
