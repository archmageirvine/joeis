package irvine.oeis.a189;
// Generated by gen_seq4.pl dex CR.THREE.multiply(CR.ONE.add(CR.THREE.multiply(CR.FIVE.sqrt()))).divide(CR.valueOf(11)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A189962 Decimal expansion of 3*(1 + 3*sqrt(5))/11.
 * @author Georg Fischer
 */
public class A189962 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A189962() {
    super(CR.THREE.multiply(CR.ONE.add(CR.THREE.multiply(CR.FIVE.sqrt()))).divide(CR.valueOf(11)));
  }
}
