package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111285.
 * @author Sean A. Irvine
 */
public class A111285 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111285() {
    super(new long[] {2, -3, 4}, new long[] {1, 2, 6});
  }
}
