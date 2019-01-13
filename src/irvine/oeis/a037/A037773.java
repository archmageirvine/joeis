package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037773.
 * @author Sean A. Irvine
 */
public class A037773 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037773() {
    super(new long[] {-5, 6, -6, 6}, new long[] {3, 16, 80, 402});
  }
}
