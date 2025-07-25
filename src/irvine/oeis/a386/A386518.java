package irvine.oeis.a386;
// Generated by gen_seq4.pl 2025-07-25.ack/decexp at 2025-07-25 21:47

import irvine.math.cr.CR;
import irvine.oeis.a001.A001620;
import irvine.oeis.a122.A122914;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A386518 Decimal expansion of (log(2*Pi)-1)/2 + gamma.
 * Formula:
 * @author Georg Fischer
 */
public class A386518 extends DecimalExpansionSequence {

  private static final DecimalExpansionSequence A001620 = new A001620();
  private static final DecimalExpansionSequence A122914 = new A122914();

  /** Construct the sequence */
  public A386518() {
    super(0, A122914.getCR().subtract(CR.ONE).add(A001620.getCR()));
  }
}
