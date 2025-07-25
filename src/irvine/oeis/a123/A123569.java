package irvine.oeis.a123;
// Generated by gen_seq4.pl 2025-07-17.ack/holos at 2025-07-18 00:03

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A123569 Number of ways to write n as an ordered sum of 1s, 2s, 3s and 4s such that no 2 precedes any 1 and no 3 precedes any 1 or 2.
 * @author Georg Fischer
 */
public class A123569 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A123569() {
    super(0, "[[0],[-1],[-1],[-1],[-2],[2],[1],[1],[3],[-2],[0],[-1],[-1],[1]]", "1,2,3,5,7,12,17,26,37,57,80,119", 0, 0);
  }
}
