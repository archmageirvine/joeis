package irvine.oeis.a230;

import irvine.oeis.LinearRecurrence;

/**
 * A230197.
 * @author Sean A. Irvine
 */
public class A230197 extends LinearRecurrence {

  /** Construct the sequence. */
  public A230197() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0}, new long[] {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2});
  }
}
