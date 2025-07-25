package irvine.oeis.a384;
// Generated by gen_seq4.pl 2025-07-25.ack/decexp at 2025-07-25 21:47

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A384872 Decimal expansion of the surface area of a pentagonal orthocupolarotunda with unit edge.
 * Formula:
 * @author Georg Fischer
 */
public class A384872 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A384872() {
    super(2, CR.FIVE.add(CR.valueOf(15).divide(CR.FOUR).multiply(CR.THREE.sqrt())).add(CR.SEVEN.divide(CR.FOUR).multiply(CR.valueOf(25).add(CR.TEN.multiply(CR.FIVE.sqrt())).sqrt())));
  }
}
