package irvine.oeis.a379;
// Generated by gen_seq4.pl 2024-12-30.ack/decexp at 2024-12-30 19:33

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A379468 Decimal expansion of sqrt(3)/(4 - sqrt(2)).
 * Formula: sqrt(3)/(4 - sqrt(2)).
 * @author Georg Fischer
 */
public class A379468 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A379468() {
    super(0, CR.THREE.sqrt().divide(CR.SQRT2.negate().add(4)));
  }
}
