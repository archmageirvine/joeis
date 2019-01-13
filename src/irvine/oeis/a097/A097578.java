package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097578.
 * @author Sean A. Irvine
 */
public class A097578 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097578() {
    super(new long[] {-4, 0, 4, 0}, new long[] {1, 6, 10, 28});
  }
}
