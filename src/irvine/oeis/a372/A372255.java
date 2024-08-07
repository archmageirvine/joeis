package irvine.oeis.a372;
// Generated by gen_seq4.pl 2024-08-02.ack/holos at 2024-08-02 23:54

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A372255 a(1) = 1, a(n) = n*(n-2)! + n - 1.
 * @author Georg Fischer
 */
public class A372255 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A372255() {
    super(1, "[[-13, 4], [-4, 1], [0], [1, -1], [1]]", "1, 3, 5, 11, 34");
  }
}
