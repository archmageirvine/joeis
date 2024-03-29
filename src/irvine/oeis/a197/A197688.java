package irvine.oeis.a197;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A197688 Decimal expansion of 2*Pi/(4+Pi).
 * @author Georg Fischer
 */
public class A197688 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A197688() {
    super(0, CR.TAU.divide(CR.FOUR.add(CR.PI)));
  }
}
