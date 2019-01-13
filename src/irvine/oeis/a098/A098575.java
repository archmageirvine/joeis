package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098575.
 * @author Sean A. Irvine
 */
public class A098575 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098575() {
    super(new long[] {2, 0, -1, 2}, new long[] {1, 1, 1, 1});
  }
}
