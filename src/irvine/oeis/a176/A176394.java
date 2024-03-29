package irvine.oeis.a176;
// Generated by gen_seq4.pl dex CR.THREE.add(CR.TWO.multiply(CR.THREE.sqrt())) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A176394 Decimal expansion of 3+2*sqrt(3).
 * @author Georg Fischer
 */
public class A176394 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A176394() {
    super(CR.THREE.add(CR.TWO.multiply(CR.THREE.sqrt())));
  }
}
