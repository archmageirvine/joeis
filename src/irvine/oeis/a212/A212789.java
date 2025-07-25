package irvine.oeis.a212;
// Generated by gen_seq4.pl 2025-06-08.ack/polyxa at 2025-06-08 23:06

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a000.A000169;
import irvine.oeis.a007.A007838;

/**
 * A212789 Number of endofunctions on [n] with distinct cycle lengths.
 * egf(new A000169()), egf(new A007838())
 * @author Georg Fischer
 */
public class A212789 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A212789() {
    super(0, "[1]", "x,B,C", 0, 1, 1, 1, egf(new A000169()), egf(new A007838()));
  }
}
