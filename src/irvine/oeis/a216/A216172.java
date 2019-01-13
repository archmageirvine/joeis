package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216172.
 * @author Sean A. Irvine
 */
public class A216172 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216172() {
    super(new long[] {1, -4, 6, -5, 5, -6, 4}, new long[] {0, 0, 1, 4, 10, 21, 39});
  }
}
