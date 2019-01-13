package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037665.
 * @author Sean A. Irvine
 */
public class A037665 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037665() {
    super(new long[] {-9, 1, 0, 9}, new long[] {3, 28, 252, 2271});
  }
}
