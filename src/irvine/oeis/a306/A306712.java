package irvine.oeis.a306;
// Generated by gen_seq4.pl dex CR.THREE.multiply(CR.THREE.sqrt()).divide(CR.PI) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A306712 Decimal expansion of 3*sqrt(3)/Pi.
 * @author Georg Fischer
 */
public class A306712 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A306712() {
    super(CR.THREE.multiply(CR.THREE.sqrt()).divide(CR.PI));
  }
}
