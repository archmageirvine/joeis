package irvine.oeis.a038;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A038866 (n+4)^3 - n^3.
 * @author Sean A. Irvine
 */
public class A038866 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038866() {
    super(1, new long[] {1, -3, 3}, new long[] {124, 208, 316});
  }
}
