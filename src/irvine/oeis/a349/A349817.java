package irvine.oeis.a349;
// Generated by gen_seq4.pl 2025-07-18.ack/polyxa at 2025-07-18 22:19

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a056.A056571;

/**
 * A349817 Number of 4 X n Fibonacci minimal checkerboards.
 * new A056571()
 * @author Georg Fischer
 */
public class A349817 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A349817() {
    super(1, "[0,1]", "1,1,x,B,x,/,/,-", 3, 0, 1, 1, new A056571());
  }
}
