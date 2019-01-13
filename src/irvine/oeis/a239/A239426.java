package irvine.oeis.a239;

import irvine.oeis.LinearRecurrence;

/**
 * A239426.
 * @author Sean A. Irvine
 */
public class A239426 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239426() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 3, 133, 931, 3441});
  }
}
