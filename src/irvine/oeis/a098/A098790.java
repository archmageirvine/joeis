package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098790.
 * @author Sean A. Irvine
 */
public class A098790 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098790() {
    super(new long[] {-1, -1, 3}, new long[] {1, 2, 6});
  }
}
