package irvine.oeis.a245;

import irvine.oeis.LinearRecurrence;

/**
 * A245179.
 * @author Sean A. Irvine
 */
public class A245179 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245179() {
    super(new long[] {-2, 0, 3, 0}, new long[] {7, 11, 13, 19});
  }
}
