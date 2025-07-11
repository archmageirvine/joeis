package irvine.oeis.a144;
// Generated by gen_seq4.pl 2025-06-15.ack/polyxa at 2025-06-15 21:33

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a000.A000012;
import irvine.oeis.a005.A005614;

/**
 * A144023 INVERT transform of the rabbit sequence, A005614.
 * new A005614(), new A000012()
 * @author Georg Fischer
 */
public class A144023 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A144023() {
    super(1, "[1]", "x,B,<1,C", 1, 0, 1, 1, new A005614(), new A000012());
  }
}
