package irvine.oeis.a343;
// Generated by gen_seq4.pl decexp at 2021-07-12 23:03

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A343964 Decimal expansion of 18 + 2*sqrt(3).
 * @author Georg Fischer
 */
public class A343964 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A343964() {
    super(1, CR.valueOf(18).add(CR.TWO.multiply(CR.THREE.sqrt())));
  }
}
