package irvine.oeis.a094;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A094882 Decimal expansion of phi/Pi, where phi = (1+sqrt(5))/2.
 * @author Georg Fischer
 */
public class A094882 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A094882() {
    super(0, CR.PHI.divide(CR.PI));
  }
}
