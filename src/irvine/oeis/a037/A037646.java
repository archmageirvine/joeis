package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037646.
 * @author Sean A. Irvine
 */
public class A037646 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037646() {
    super(new long[] {-4, 1, 0, 4}, new long[] {3, 12, 49, 199});
  }
}
