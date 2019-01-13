package irvine.oeis.a258;

import irvine.oeis.LinearRecurrence;

/**
 * A258717.
 * @author Sean A. Irvine
 */
public class A258717 extends LinearRecurrence {

  /** Construct the sequence. */
  public A258717() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 3, 16, 27});
  }
}
