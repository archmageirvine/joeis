package irvine.oeis.a230;

import irvine.oeis.LinearRecurrence;

/**
 * A230081.
 * @author Sean A. Irvine
 */
public class A230081 extends LinearRecurrence {

  /** Construct the sequence. */
  public A230081() {
    super(new long[] {1, -1, -4, 3, 3}, new long[] {0, 4, 13, 50, 173});
  }
}
