package irvine.oeis.a093;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A093064 Decimal expansion of (4 + 3*log(3))/20.
 * @author Georg Fischer
 */
public class A093064 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A093064() {
    super(0, CR.FOUR.add(CR.THREE.multiply(CR.THREE.log())).divide(CR.valueOf(20)));
  }
}
