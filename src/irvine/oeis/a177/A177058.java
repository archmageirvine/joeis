package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177058.
 * @author Sean A. Irvine
 */
public class A177058 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177058() {
    super(new long[] {-1, 4, -6, 4}, new long[] {3, 1, -1, 3});
  }
}
