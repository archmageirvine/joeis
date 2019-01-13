package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187892.
 * @author Sean A. Irvine
 */
public class A187892 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187892() {
    super(new long[] {-1, 0, 2}, new long[] {0, 6, 5});
  }
}
