package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192774.
 * @author Sean A. Irvine
 */
public class A192774 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192774() {
    super(new long[] {1, 1, -5, -1, 5, 1}, new long[] {0, 0, 1, 1, 6, 10});
  }
}
