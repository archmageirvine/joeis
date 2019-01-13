package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187917.
 * @author Sean A. Irvine
 */
public class A187917 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187917() {
    super(new long[] {-1, -4, -2, 4}, new long[] {0, 3, 14, 50});
  }
}
