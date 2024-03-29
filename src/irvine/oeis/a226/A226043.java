package irvine.oeis.a226;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A226043 Decimal expansion of 355/113-Pi.
 * @author Georg Fischer
 */
public class A226043 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A226043() {
    super(0, CR.valueOf(355).divide(CR.valueOf(113)).subtract(CR.PI));
  }
}
