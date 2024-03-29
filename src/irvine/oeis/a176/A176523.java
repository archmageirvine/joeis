package irvine.oeis.a176;
// Generated by gen_seq4.pl dex CR.valueOf(45).add(CR.THREE.multiply(CR.valueOf(235).sqrt())).divide(CR.TEN) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A176523 Decimal expansion of (45+3*sqrt(235))/10.
 * @author Georg Fischer
 */
public class A176523 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A176523() {
    super(CR.valueOf(45).add(CR.THREE.multiply(CR.valueOf(235).sqrt())).divide(CR.TEN));
  }
}
