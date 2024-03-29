package irvine.oeis.a118;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A118308 Decimal expansion of (9*sqrt(3))/2 + 5*Pi.
 * @author Georg Fischer
 */
public class A118308 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A118308() {
    super(2, CR.NINE.multiply(CR.THREE.sqrt()).divide(CR.TWO).add(CR.FIVE.multiply(CR.PI)));
  }
}
