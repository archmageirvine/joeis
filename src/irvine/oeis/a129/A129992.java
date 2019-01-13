package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129992.
 * @author Sean A. Irvine
 */
public class A129992 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129992() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 17, 308, 381, 468, 2117, 2540});
  }
}
