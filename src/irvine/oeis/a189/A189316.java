package irvine.oeis.a189;

import irvine.oeis.LinearRecurrence;

/**
 * A189316.
 * @author Sean A. Irvine
 */
public class A189316 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189316() {
    super(new long[] {-1, 2, 2}, new long[] {5, 5, 15});
  }
}
