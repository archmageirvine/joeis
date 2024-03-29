package irvine.oeis.a182;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A182023 Decimal expansion of log(2+sqrt(3))/4.
 * @author Georg Fischer
 */
public class A182023 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A182023() {
    super(0, CR.TWO.add(CR.THREE.sqrt()).log().divide(CR.FOUR));
  }
}
