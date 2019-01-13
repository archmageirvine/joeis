package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104621.
 * @author Sean A. Irvine
 */
public class A104621 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104621() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1}, new long[] {7, 1, 3, 7, 15, 31, 63});
  }
}
