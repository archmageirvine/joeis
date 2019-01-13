package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180516.
 * @author Sean A. Irvine
 */
public class A180516 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180516() {
    super(new long[] {-4, 4, 0, 1}, new long[] {0, 1, 2, 3});
  }
}
