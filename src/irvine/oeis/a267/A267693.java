package irvine.oeis.a267;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A267693 Decimal expansion of 477/4237.
 * @author Georg Fischer
 */
public class A267693 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A267693() {
    super(0, CR.valueOf(477).divide(CR.valueOf(4237)));
  }
}
