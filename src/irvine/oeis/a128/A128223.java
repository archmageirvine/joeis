package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128223.
 * @author Sean A. Irvine
 */
public class A128223 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128223() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 1, 3, 7, 10});
  }
}
