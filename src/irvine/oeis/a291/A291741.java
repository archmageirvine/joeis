package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291741.
 * @author Sean A. Irvine
 */
public class A291741 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291741() {
    super(new long[] {1, 0, 3, -1, 3, -2, 2, -1, 1}, new long[] {1, 0, 1, 1, 1, 4, 5, 7, 11});
  }
}
