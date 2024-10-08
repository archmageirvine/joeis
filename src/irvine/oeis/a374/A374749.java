package irvine.oeis.a374;
// Generated by gen_seq4.pl 2024-10-02.ack/holos at 2024-10-02 22:45

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A374749 Number of zygodrome numbers in base-10 (A033023) with n or fewer digits.
 * @author Georg Fischer
 */
public class A374749 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A374749() {
    super(1, "[0, -9, 8, 2, -1]", "0, 9, 18", 0, 0);
  }
}
