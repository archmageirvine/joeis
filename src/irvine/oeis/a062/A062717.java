package irvine.oeis.a062;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A062717 Numbers m such that 6*m+1 is a perfect square.
 * @author Sean A. Irvine
 */
public class A062717 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062717() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 4, 8, 20, 28});
  }
}
