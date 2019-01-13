package irvine.oeis.a239;

import irvine.oeis.LinearRecurrence;

/**
 * A239195.
 * @author Sean A. Irvine
 */
public class A239195 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239195() {
    super(new long[] {-1, 2, -1, 2, -4, 2, -1, 2}, new long[] {1, 5, 17, 42, 78, 134, 215, 315});
  }
}
