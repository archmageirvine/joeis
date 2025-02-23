package irvine.oeis.a365;
// Generated by gen_seq4.pl 2025-02-08.ack/decexp at 2025-02-08 20:47

import irvine.math.cr.CR;
import irvine.oeis.a066.A066716;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A365238 Decimal expansion of 1/A066716 (Binary Champernowne constant).
 * Formula:
 * @author Georg Fischer
 */
public class A365238 extends DecimalExpansionSequence {

  private static final DecimalExpansionSequence A066716 = new A066716();

  /** Construct the sequence */
  public A365238() {
    super(1, CR.ONE.divide(A066716.getCR()));
  }
}
