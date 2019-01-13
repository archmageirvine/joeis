package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037480.
 * @author Sean A. Irvine
 */
public class A037480 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037480() {
    super(new long[] {-3, 1, 3}, new long[] {1, 5, 16});
  }
}
