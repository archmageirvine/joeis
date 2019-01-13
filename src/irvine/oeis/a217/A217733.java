package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217733.
 * @author Sean A. Irvine
 */
public class A217733 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217733() {
    super(new long[] {-1, -2, 3, 1}, new long[] {1, 2, 4, 8});
  }
}
