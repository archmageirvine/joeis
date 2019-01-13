package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037737.
 * @author Sean A. Irvine
 */
public class A037737 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037737() {
    super(new long[] {-4, 1, 0, 0, 4}, new long[] {2, 9, 39, 156, 626});
  }
}
