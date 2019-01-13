package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128102.
 * @author Sean A. Irvine
 */
public class A128102 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128102() {
    super(new long[] {-4, 12, -1, -16, 2, 4}, new long[] {0, 0, 5, 14, 69, 224});
  }
}
