package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037561.
 * @author Sean A. Irvine
 */
public class A037561 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037561() {
    super(new long[] {-4, 1, 0, 4}, new long[] {2, 10, 41, 166});
  }
}
