package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153465 9*4^n - 2.
 * @author Sean A. Irvine
 */
public class A153465 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153465() {
    super(new long[] {-4, 5}, new long[] {34, 142});
  }
}
