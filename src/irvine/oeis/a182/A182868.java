package irvine.oeis.a182;

import irvine.oeis.LinearRecurrence;

/**
 * A182868.
 * @author Sean A. Irvine
 */
public class A182868 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182868() {
    super(new long[] {1, -3, 3}, new long[] {-1, 4, 17});
  }
}
