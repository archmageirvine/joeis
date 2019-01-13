package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081661.
 * @author Sean A. Irvine
 */
public class A081661 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081661() {
    super(new long[] {-2, 5, -2, -4, 4}, new long[] {1, 3, 8, 16, 31});
  }
}
