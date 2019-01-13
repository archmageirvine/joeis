package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098183.
 * @author Sean A. Irvine
 */
public class A098183 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098183() {
    super(new long[] {1, 0, 3}, new long[] {1, 1, 4});
  }
}
