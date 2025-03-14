package irvine.oeis.a376;
// Generated by gen_seq4.pl 2025-02-10.ack/decexp at 2025-02-10 21:26

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A376330 Decimal expansion of 1 bit in J/K.
 * Formula: e-23*log(2)
 * @author Georg Fischer
 */
public class A376330 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A376330() {
    super(-23, CR.valueOf("1.380649").multiply(CR.TWO.log()).divide(CR.TEN.pow(23)));
  }
}
