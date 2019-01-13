package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187890.
 * @author Sean A. Irvine
 */
public class A187890 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187890() {
    super(new long[] {-1, 0, 2}, new long[] {0, 4, 3});
  }
}
