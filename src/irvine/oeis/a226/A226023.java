package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226023.
 * @author Sean A. Irvine
 */
public class A226023 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226023() {
    super(new long[] {1, -1, 0, -2, 2, 0, 1}, new long[] {0, 2, 3, 6, 12, 15, 20});
  }
}
