package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105058.
 * @author Sean A. Irvine
 */
public class A105058 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105058() {
    super(new long[] {-1, 5, 5}, new long[] {1, 13, 69});
  }
}
