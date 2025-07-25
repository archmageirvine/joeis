package irvine.oeis.a385;
// Generated by gen_seq4.pl 2025-07-25.ack/decexp at 2025-07-25 21:47

import irvine.math.cr.CR;
import irvine.oeis.a002.A002163;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A385260 Decimal expansion of the volume of a gyroelongated pentagonal bicupola with unit edge.
 * Formula:
 * @author Georg Fischer
 */
public class A385260 extends DecimalExpansionSequence {

  private static final DecimalExpansionSequence A002163 = new A002163();

  /** Construct the sequence */
  public A385260() {
    super(2, CR.TEN.add(CR.EIGHT.multiply(A002163.getCR())).add(CR.FIVE.multiply(CR.TWO.multiply(CR.valueOf(650).add(CR.valueOf(290).multiply(A002163.getCR())).sqrt().subtract(A002163.getCR()).subtract(CR.ONE)).sqrt())).divide(CR.SIX));
  }
}
