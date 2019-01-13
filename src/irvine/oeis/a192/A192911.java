package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192911.
 * @author Sean A. Irvine
 */
public class A192911 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192911() {
    super(new long[] {1, -1, 2, 5, 4, 1}, new long[] {1, 0, 0, 3, 5, 16});
  }
}
