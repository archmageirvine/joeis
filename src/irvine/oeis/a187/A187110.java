package irvine.oeis.a187;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A187110 Decimal expansion of sqrt(3/8).
 * @author Georg Fischer
 */
public class A187110 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A187110() {
    super(0, CR.THREE.divide(CR.EIGHT).sqrt());
  }
}
