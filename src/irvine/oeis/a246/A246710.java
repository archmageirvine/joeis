package irvine.oeis.a246;
// Generated by gen_seq4.pl decexp at 2021-07-16 22:36

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A246710 Decimal expansion of eighth root of 3.
 * Formula: 3^(1/8)
 * @author Georg Fischer
 */
public class A246710 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A246710() {
    super(1, CR.THREE.pow(CR.ONE.divide(CR.EIGHT)));
  }
}
