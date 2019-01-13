package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212751.
 * @author Sean A. Irvine
 */
public class A212751 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212751() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {1, 14, 70, 198, 477, 924, 1696, 2768});
  }
}
