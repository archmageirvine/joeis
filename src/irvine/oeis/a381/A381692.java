package irvine.oeis.a381;
// Generated by gen_seq4.pl 2025-03-23.ack/decexp at 2025-03-23 22:08

import irvine.math.cr.CR;
import irvine.oeis.a377.A377694;
import irvine.oeis.a377.A377695;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A381692 Decimal expansion of the isoperimetric quotient of a truncated dodecahedron.
 * Formula:
 * @author Georg Fischer
 */
public class A381692 extends DecimalExpansionSequence {

  private static final DecimalExpansionSequence A377694 = new A377694();
  private static final DecimalExpansionSequence A377695 = new A377695();

  /** Construct the sequence */
  public A381692() {
    super(0, CR.valueOf(36).multiply(CR.PI).multiply(A377695.getCR().square()).divide(A377694.getCR().pow(3)));
  }
}
