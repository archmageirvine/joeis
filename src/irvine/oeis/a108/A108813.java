package irvine.oeis.a108;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A108813 Decimal expansion of the continued fraction 2/(5+4/(7+6/(9+8/(11+10/(13+12/...
 * @author Georg Fischer
 */
public class A108813 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A108813() {
    super(0, CR.TWO.multiply(CR.FIVE.subtract(CR.THREE.multiply(CR.HALF.exp()))).divide(CR.TWO.multiply(CR.HALF.exp()).subtract(CR.THREE)));
  }
}
