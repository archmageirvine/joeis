package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274075.
 * @author Sean A. Irvine
 */
public class A274075 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274075() {
    super(new long[] {1, 9, -1}, new long[] {3, -1, 19});
  }
}
