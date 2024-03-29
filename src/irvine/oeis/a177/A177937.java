package irvine.oeis.a177;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A177937 Decimal expansion of sqrt(17791).
 * @author Georg Fischer
 */
public class A177937 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A177937() {
    super(3, CR.valueOf(17791).sqrt());
  }
}
