package irvine.oeis.a384;
// Generated by gen_seq4.pl 2025-07-25.ack/decexp at 2025-07-25 21:47

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A384910 Decimal expansion of the volume of an elongated pentagonal orthocupolarotunda with unit edge.
 * Formula:
 * @author Georg Fischer
 */
public class A384910 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A384910() {
    super(2, CR.FIVE.divide(CR.valueOf(12)).multiply(CR.valueOf(11).add(CR.FIVE.multiply(CR.FIVE.sqrt())).add(CR.SIX.multiply(CR.FIVE.add(CR.TWO.multiply(CR.FIVE.sqrt())).sqrt()))));
  }
}
