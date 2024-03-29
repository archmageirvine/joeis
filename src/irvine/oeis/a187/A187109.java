package irvine.oeis.a187;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A187109 Decimal expansion of sqrt(2/11).
 * @author Georg Fischer
 */
public class A187109 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A187109() {
    super(0, CR.TWO.divide(CR.valueOf(11)).sqrt());
  }
}
