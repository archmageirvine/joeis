package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226538.
 * @author Sean A. Irvine
 */
public class A226538 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226538() {
    super(new long[] {-1, 0, 0, 0, 2, 0}, new long[] {1, 1, 2, 3, 4, 6});
  }
}
