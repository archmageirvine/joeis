package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097136.
 * @author Sean A. Irvine
 */
public class A097136 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097136() {
    super(new long[] {1, -4, 4}, new long[] {1, 4, 10});
  }
}
