package irvine.oeis.a220;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A220351 Decimal expansion of (3*sqrt(3)+sqrt(7))/10.
 * @author Georg Fischer
 */
public class A220351 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A220351() {
    super(0, CR.THREE.multiply(CR.THREE.sqrt()).add(CR.SEVEN.sqrt()).divide(CR.TEN));
  }
}
