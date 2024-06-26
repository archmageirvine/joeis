package irvine.oeis.a366;
// Generated by gen_seq4.pl 2024-06-06/holos at 2024-06-06 20:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A366940 a(n) is the number of positive squares with n digits, all distinct.
 * @author Georg Fischer
 */
public class A366940 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A366940() {
    super(1, "[0, 1, -1]", "3, 6, 13, 36, 66, 96, 123, 97, 83, 87, 0", 0, 0);
  }
}
