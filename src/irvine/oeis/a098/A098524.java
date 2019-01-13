package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098524.
 * @author Sean A. Irvine
 */
public class A098524 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098524() {
    super(new long[] {4, 0, 0, 0, 1}, new long[] {1, 1, 3, 3, 3});
  }
}
