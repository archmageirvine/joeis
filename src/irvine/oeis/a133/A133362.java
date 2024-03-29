package irvine.oeis.a133;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A133362 Decimal expansion of 1/(2 log 2).
 * @author Georg Fischer
 */
public class A133362 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A133362() {
    super(0, CR.ONE.divide(CR.TWO.multiply(CR.TWO.log())));
  }
}
