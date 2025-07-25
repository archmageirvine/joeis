package irvine.oeis.a385;
// Generated by gen_seq4.pl 2025-07-25.ack/decexp at 2025-07-25 21:47

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A385535 Decimal expansion of the surface area of a biaugmented pentagonal prism with unit edge.
 * Formula:
 * @author Georg Fischer
 */
public class A385535 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A385535() {
    super(1, CR.THREE.add(CR.TWO.multiply(CR.THREE.sqrt())).add(CR.valueOf(25).divide(CR.FOUR).add(CR.FIVE.multiply(CR.FIVE.sqrt()).divide(CR.TWO)).sqrt()));
  }
}
