package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037506.
 * @author Sean A. Irvine
 */
public class A037506 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037506() {
    super(new long[] {-5, 1, 0, 5}, new long[] {1, 7, 35, 176});
  }
}
