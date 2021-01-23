package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214732 25n^2 + 15n + 1021.
 * @author Sean A. Irvine
 */
public class A214732 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214732() {
    super(new long[] {1, -3, 3}, new long[] {1021, 1061, 1151});
  }
}
