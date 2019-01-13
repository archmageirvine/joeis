package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037585.
 * @author Sean A. Irvine
 */
public class A037585 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037585() {
    super(new long[] {-6, 1, 6}, new long[] {3, 19, 117});
  }
}
