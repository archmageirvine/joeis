package irvine.oeis.a240;
// manually verified, 2023-04-29

import irvine.oeis.recur.LinearRecurrence;

/**
 * A240506 Number of length-n gap-free words on {1,2,3}.
 * @author Georg Fischer
 */
public class A240506 extends LinearRecurrence {

  /** Construct the sequence. */
  public A240506() {
    super(new long[] {6L, -11L, 6L}, new long[] {3L, 7L, 21L}, 1L);
  }
}
