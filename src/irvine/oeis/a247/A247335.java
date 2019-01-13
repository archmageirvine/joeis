package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247335.
 * @author Sean A. Irvine
 */
public class A247335 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247335() {
    super(new long[] {1, -39, 39}, new long[] {1, 10, 361});
  }
}
