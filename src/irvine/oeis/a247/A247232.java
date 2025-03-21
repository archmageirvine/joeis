package irvine.oeis.a247;
// Generated by gen_seq4.pl 2025-01-01.ack/parmof2 at 2025-01-01 23:25

import irvine.oeis.a001.A001929;
import irvine.oeis.a111.A111594;

/**
 * A247232 Triangular array read by rows: T(n,k) is the number of pre-orders on an n-set with exactly k connected components in its digraph representation, n&gt;=1, 1&lt;=k&lt;=n.
 * @author Georg Fischer
 */
public class A247232 extends A111594 {

  /** Construct the sequence. */
  public A247232() {
    super(1, new A001929().skip(1));
  }
}
