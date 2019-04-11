package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228564 Largest odd divisor of <code>n^2 + 1</code>.
 * @author Sean A. Irvine
 */
public class A228564 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228564() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {1, 1, 5, 5, 17, 13});
  }
}
