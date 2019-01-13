package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097325.
 * @author Sean A. Irvine
 */
public class A097325 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097325() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {0, 1, 1, 1, 1, 1});
  }
}
