package irvine.oeis.a240;

import irvine.oeis.LinearRecurrence;

/**
 * A240438.
 * @author Sean A. Irvine
 */
public class A240438 extends LinearRecurrence {

  /** Construct the sequence. */
  public A240438() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {0, 1, 5, 11, 18});
  }
}
