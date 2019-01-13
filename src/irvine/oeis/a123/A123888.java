package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123888.
 * @author Sean A. Irvine
 */
public class A123888 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123888() {
    super(new long[] {1, 0, -3, 0, 3}, new long[] {1, 3, 9, 24, 63});
  }
}
