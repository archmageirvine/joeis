package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180147.
 * @author Sean A. Irvine
 */
public class A180147 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180147() {
    super(new long[] {-6, 3, 4}, new long[] {1, 7, 31});
  }
}
