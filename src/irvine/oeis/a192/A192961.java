package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192961.
 * @author Sean A. Irvine
 */
public class A192961 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192961() {
    super(new long[] {-1, 2, 1, -5, 4}, new long[] {0, 1, 4, 11, 26});
  }
}
