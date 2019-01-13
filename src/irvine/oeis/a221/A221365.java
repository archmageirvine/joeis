package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221365.
 * @author Sean A. Irvine
 */
public class A221365 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221365() {
    super(new long[] {1, 0, -6, 0, 6, 0}, new long[] {1, 3, 1, 21, 1, 108});
  }
}
