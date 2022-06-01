package irvine.oeis.a204;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A204453 Period length 14: [0, 1, 2, 3, 4, 5, 6, 0, 6, 5, 4, 3, 2, 1] repeated.
 * @author Sean A. Irvine
 */
public class A204453 extends LinearRecurrence {

  /** Construct the sequence. */
  public A204453() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 2, 3, 4, 5, 6, 0, 6, 5, 4, 3, 2, 1});
  }
}
