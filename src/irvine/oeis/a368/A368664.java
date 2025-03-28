package irvine.oeis.a368;
// Generated by gen_seq4.pl 2025-02-08.ack/decexp at 2025-02-08 09:46

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A368664 Decimal expansion of the probability that the straight tromino appears when the 3rd cell is added in diffusion-limited aggregation on the square lattice.
 * Formula:
 * @author Georg Fischer
 */
public class A368664 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A368664() {
    super(0, CR.FOUR.subtract(CR.PI).divide(CR.valueOf(24).subtract(CR.SEVEN.multiply(CR.PI))));
  }
}
