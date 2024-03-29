package irvine.oeis.a068;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A068434 Expansion of log(5) in base 2.
 * @author Georg Fischer
 */
public class A068434 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A068434() {
    super(1, CR.FIVE.log(), 2);
  }
}
