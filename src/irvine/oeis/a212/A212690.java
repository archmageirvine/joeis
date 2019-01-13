package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212690.
 * @author Sean A. Irvine
 */
public class A212690 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212690() {
    super(new long[] {1, -3, 1, 5, -5, -1, 3}, new long[] {0, 1, 16, 75, 236, 567, 1172});
  }
}
