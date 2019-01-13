package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098180.
 * @author Sean A. Irvine
 */
public class A098180 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098180() {
    super(new long[] {-1, 2, -2, 2}, new long[] {1, 2, 2, 3});
  }
}
