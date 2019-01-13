package irvine.oeis.a240;

import irvine.oeis.LinearRecurrence;

/**
 * A240607.
 * @author Sean A. Irvine
 */
public class A240607 extends LinearRecurrence {

  /** Construct the sequence. */
  public A240607() {
    super(new long[] {1, 1, 2, 0}, new long[] {0, 0, 0, 1});
  }
}
