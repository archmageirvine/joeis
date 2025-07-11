package irvine.oeis.a369;
// Generated by gen_seq4.pl 2025-06-08.ack/polyxa at 2025-06-08 23:06

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a000.A000169;

/**
 * A369140 Number of labeled loop-graphs covering {1..n} such that it is possible to choose a different vertex from each edge (choosable).
 * egf(new A000169())
 * @author Georg Fischer
 */
public class A369140 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A369140() {
    super(0, "[1],[0,-1]", "p1,exp,3,x,B,*,2,/,3,x,B,^2,*,4,/,-,exp,*,1,x,B,-,sqrt,/", 0, 1, 1, 1, egf(new A000169()));
  }
}
