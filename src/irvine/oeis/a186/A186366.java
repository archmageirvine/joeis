package irvine.oeis.a186;
// Generated by gen_seq4.pl 2025-01-01.ack/parmof2 at 2025-01-01 23:25

import irvine.oeis.a000.A000111;
import irvine.oeis.a111.A111594;

/**
 * A186366 Triangle read by rows: T(n,k) is the number of cycle-up-down permutations of {1,2,...,n} having k cycles (1&lt;=k&lt;=n).
 * @author Georg Fischer
 */
public class A186366 extends A111594 {

  /** Construct the sequence. */
  public A186366() {
    super(1, new A000111());
  }
}
