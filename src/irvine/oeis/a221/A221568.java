package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221568.
 * @author Sean A. Irvine
 */
public class A221568 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221568() {
    super(new long[] {1, -1, 2, 3}, new long[] {0, 10, 26, 100});
  }
}
