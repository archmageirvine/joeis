package irvine.oeis.a113;
// Generated by gen_seq4.pl dex CR.FIVE.log().divide(CR.THREE.log()) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A113209 Decimal expansion of log(5)/log(3).
 * @author Georg Fischer
 */
public class A113209 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A113209() {
    super(CR.FIVE.log().divide(CR.THREE.log()));
  }
}
