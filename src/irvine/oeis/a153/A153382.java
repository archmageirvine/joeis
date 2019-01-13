package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153382.
 * @author Sean A. Irvine
 */
public class A153382 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153382() {
    super(new long[] {-1, -1, 2, 1}, new long[] {0, 8, 10, 18});
  }
}
