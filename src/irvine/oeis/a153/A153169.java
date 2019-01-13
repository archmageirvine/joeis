package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153169.
 * @author Sean A. Irvine
 */
public class A153169 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153169() {
    super(new long[] {1, -3, 3}, new long[] {19, 43, 75});
  }
}
