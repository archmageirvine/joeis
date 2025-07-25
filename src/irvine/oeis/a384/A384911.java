package irvine.oeis.a384;
// Generated by gen_seq4.pl 2025-07-25.ack/decexp at 2025-07-25 21:47

import irvine.math.cr.CR;
import irvine.oeis.a002.A002163;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A384911 Decimal expansion of the surface area of an elongated pentagonal orthocupolarotunda with unit edge.
 * Formula:
 * @author Georg Fischer
 */
public class A384911 extends DecimalExpansionSequence {

  private static final DecimalExpansionSequence A002163 = new A002163();

  /** Construct the sequence */
  public A384911() {
    super(2, CR.valueOf(60).add(CR.TEN.multiply(CR.valueOf(190).add(CR.valueOf(49).multiply(A002163.getCR())).add(CR.valueOf(21).multiply(CR.valueOf(75).add(CR.valueOf(30).multiply(A002163.getCR())).sqrt()))).sqrt()).divide(CR.FOUR));
  }
}
