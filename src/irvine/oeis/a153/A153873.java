package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153873.
 * @author Sean A. Irvine
 */
public class A153873 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153873() {
    super(new long[] {1, -4, 4}, new long[] {8, 17, 44});
  }
}
