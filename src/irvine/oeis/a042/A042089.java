package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042089.
 * @author Sean A. Irvine
 */
public class A042089 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042089() {
    super(new long[] {-1, 0, 0, 0, 286, 0, 0, 0}, new long[] {1, 1, 5, 6, 281, 287, 1429, 1716});
  }
}
