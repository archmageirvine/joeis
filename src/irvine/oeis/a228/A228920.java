package irvine.oeis.a228;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A228920 Number of solutions to Sum_{i=1..n} x_i^2 == 0 (mod 4) with x_i in 0..3.
 * @author Sean A. Irvine
 */
public class A228920 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228920() {
    super(1, new long[] {32, -24, 8}, new long[] {2, 4, 8});
  }
}
