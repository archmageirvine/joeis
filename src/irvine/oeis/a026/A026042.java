package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026042.
 * @author Sean A. Irvine
 */
public class A026042 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026042() {
    super(new long[] {-1, 3, -3, 1, 0, 1, -3, 3}, new long[] {4, 8, 12, 19, 28, 40, 56, 74});
  }
}
