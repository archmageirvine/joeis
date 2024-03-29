package irvine.oeis.a231;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A231863 Decimal expansion of 1/sqrt(2*Pi).
 * @author Georg Fischer
 */
public class A231863 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A231863() {
    super(0, CR.ONE.divide(CR.TAU.sqrt()));
  }
}
