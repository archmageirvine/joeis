package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153267.
 * @author Sean A. Irvine
 */
public class A153267 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153267() {
    super(new long[] {-4, 11, -1}, new long[] {-5, 39, -110});
  }
}
