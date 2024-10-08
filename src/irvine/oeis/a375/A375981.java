package irvine.oeis.a375;
// Generated by gen_seq4.pl 2024-10-02.ack/holos at 2024-10-02 22:45

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A375981 Number of subsets of {1,2,...,n} such that no two elements differ by 1, 4, or 5.
 * @author Georg Fischer
 */
public class A375981 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A375981() {
    super(0, "[0, -1, 0, 0, 1, 0, 1, 0, -1, 1, 0, 1, -1]", "1, 2, 3, 5, 8, 11, 14, 19, 25, 34, 49", 0, 0);
  }
}
