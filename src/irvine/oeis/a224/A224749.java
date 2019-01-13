package irvine.oeis.a224;

import irvine.oeis.LinearRecurrence;

/**
 * A224749.
 * @author Sean A. Irvine
 */
public class A224749 extends LinearRecurrence {

  /** Construct the sequence. */
  public A224749() {
    super(new long[] {6, 6, 6, 6, 3}, new long[] {0, 1, 3, 15, 69});
  }
}
