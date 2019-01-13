package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153192.
 * @author Sean A. Irvine
 */
public class A153192 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153192() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {5, 7, 18, 22, 39});
  }
}
