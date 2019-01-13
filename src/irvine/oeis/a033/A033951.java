package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033951.
 * @author Sean A. Irvine
 */
public class A033951 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033951() {
    super(new long[] {1, -3, 3}, new long[] {1, 8, 23});
  }
}
