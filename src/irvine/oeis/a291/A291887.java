package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291887.
 * @author Sean A. Irvine
 */
public class A291887 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291887() {
    super(new long[] {4, -10, -10, 27, -8, -9, 6}, new long[] {1, 3, 11, 31, 91, 250, 690});
  }
}
