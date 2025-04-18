package irvine.oeis.a123;
// Generated by gen_seq4.pl 2025-02-08.ack/decexp at 2025-02-08 09:46

import irvine.math.cr.CR;
import irvine.oeis.a111.A111003;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A123092 Decimal expansion of Sum_{k&gt;=1} 1/((2k-1)^2(2k+1)^2) = (Pi^2-8)/16.
 * Formula:
 * @author Georg Fischer
 */
public class A123092 extends DecimalExpansionSequence {

  private static final DecimalExpansionSequence A111003 = new A111003();

  /** Construct the sequence */
  public A123092() {
    super(0, A111003.getCR().subtract(CR.ONE).divide(CR.TWO));
  }
}
