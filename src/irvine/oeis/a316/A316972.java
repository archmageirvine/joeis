package irvine.oeis.a316;
// Generated by gen_seq4.pl 2025-06-10.ack/polyxa at 2025-06-10 21:36

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a020.A020555;

/**
 * A316972 Number of connected multiset partitions of {1, 1, 2, 2, 3, 3, ..., n, n}.
 * egf(new A020555())
 * @author Georg Fischer
 */
public class A316972 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A316972() {
    super(0, "[1]", "x,B,log,1,+", 0, 1, 1, 1, egf(new A020555()));
  }
}
