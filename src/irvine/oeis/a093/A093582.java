package irvine.oeis.a093;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A093582 Decimal expansion of 3/(2*Pi).
 * @author Georg Fischer
 */
public class A093582 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A093582() {
    super(0, CR.THREE.divide(CR.TAU));
  }
}
