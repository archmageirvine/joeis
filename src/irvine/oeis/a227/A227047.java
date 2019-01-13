package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227047.
 * @author Sean A. Irvine
 */
public class A227047 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227047() {
    super(new long[] {1, 1, 0, 1, 0, 1}, new long[] {0, 0, 1, 1, 2, 3});
  }
}
