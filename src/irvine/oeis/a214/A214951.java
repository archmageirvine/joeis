package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214951.
 * @author Sean A. Irvine
 */
public class A214951 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214951() {
    super(new long[] {1, 6, 3}, new long[] {2, 5, 26});
  }
}
