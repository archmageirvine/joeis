package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128533.
 * @author Sean A. Irvine
 */
public class A128533 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128533() {
    super(new long[] {-1, 2, 2}, new long[] {0, 4, 7});
  }
}
