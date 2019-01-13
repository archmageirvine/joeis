package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097062.
 * @author Sean A. Irvine
 */
public class A097062 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097062() {
    super(new long[] {-1, 1, 1}, new long[] {1, -1, 3});
  }
}
