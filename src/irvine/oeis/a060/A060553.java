package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060553.
 * @author Sean A. Irvine
 */
public class A060553 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060553() {
    super(new long[] {8, -4, -4, -2, 2, 2}, new long[] {2, 2, 4, 6, 10, 16});
  }
}
