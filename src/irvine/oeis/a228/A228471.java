package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228471.
 * @author Sean A. Irvine
 */
public class A228471 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228471() {
    super(new long[] {1, 0, 6, 0}, new long[] {3, 5, 19, 31});
  }
}
