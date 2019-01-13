package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192913.
 * @author Sean A. Irvine
 */
public class A192913 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192913() {
    super(new long[] {1, -1, 2, 5, 4, 1}, new long[] {0, 0, 2, 3, 10, 32});
  }
}
