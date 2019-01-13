package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212753.
 * @author Sean A. Irvine
 */
public class A212753 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212753() {
    super(new long[] {1, -4, 5, 0, -5, 4}, new long[] {0, 12, 69, 228, 568, 1192});
  }
}
