package irvine.oeis.a196;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A196567 Decimal expansion of log(log(6)).
 * @author Georg Fischer
 */
public class A196567 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A196567() {
    super(0, CR.SIX.log().log());
  }
}
