package irvine.oeis.a165;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A165922 Decimal expansion of 2*sqrt(3)/(9*Pi).
 * @author Georg Fischer
 */
public class A165922 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A165922() {
    super(0, CR.TWO.multiply(CR.THREE.sqrt()).divide(CR.NINE.multiply(CR.PI)));
  }
}
