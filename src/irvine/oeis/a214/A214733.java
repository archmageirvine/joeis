package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214733.
 * @author Sean A. Irvine
 */
public class A214733 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214733() {
    super(new long[] {-3, -1}, new long[] {0, 1});
  }
}
