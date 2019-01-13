package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125501.
 * @author Sean A. Irvine
 */
public class A125501 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125501() {
    super(new long[] {-1, 36, -105, 112, -54, 12}, new long[] {1, 2, 5, 14, 42, 132});
  }
}
