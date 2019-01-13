package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098526.
 * @author Sean A. Irvine
 */
public class A098526 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098526() {
    super(new long[] {16, 0, 0, 0, 1}, new long[] {1, 1, 5, 5, 5});
  }
}
