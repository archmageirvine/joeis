package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110034.
 * @author Sean A. Irvine
 */
public class A110034 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110034() {
    super(new long[] {1, -3, 0, 3}, new long[] {1, 0, -1, -4});
  }
}
