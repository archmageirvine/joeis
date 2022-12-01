package irvine.oeis.a216;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A216134 Numbers k such that 2 * A000217(k) + 1 is triangular.
 * @author Sean A. Irvine
 */
public class A216134 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216134() {
    super(new long[] {1, -1, -6, 6, 1}, new long[] {0, 1, 4, 9, 26});
  }
}
