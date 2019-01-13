package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226639.
 * @author Sean A. Irvine
 */
public class A226639 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226639() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 1, 1, 5, 20});
  }
}
