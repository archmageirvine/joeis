package irvine.oeis.a239;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A239354 Decimal expansion of 3/4 - log(2).
 * @author Georg Fischer
 */
public class A239354 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A239354() {
    super(0, CR.THREE.divide(CR.FOUR).subtract(CR.TWO.log()));
  }
}
