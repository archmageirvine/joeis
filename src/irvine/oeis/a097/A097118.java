package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097118.
 * @author Sean A. Irvine
 */
public class A097118 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097118() {
    super(new long[] {5, -1, 2}, new long[] {1, 1, 1});
  }
}
