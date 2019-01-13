package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214260.
 * @author Sean A. Irvine
 */
public class A214260 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214260() {
    super(new long[] {1, 0, 2}, new long[] {0, 1, 3});
  }
}
